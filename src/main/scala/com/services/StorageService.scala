package com.services


import com.amazonaws.AmazonClientException
import com.amazonaws.auth.AWSCredentials
import com.amazonaws.auth.BasicAWSCredentials
import com.amazonaws.services.s3.transfer.TransferManager
import com.amazonaws.services.s3.transfer.Upload

import java.io.{PrintWriter, File}
import java.util.Calendar
import java.time.LocalDate

import net.liftweb.json._
import net.liftweb.json.Serialization.write
import net.liftweb.json.JsonDSL._

object StorageService {
    
    implicit val formats = DefaultFormats
    
    //Function: Write the composite JSOn object to an S3 Bucket
    def writeObjectToS3(data: String, fileName: String): String = { 

        //Here I use Java Printwriter to write object to a temporary file
        val f: File = new File(fileName)
        f.createNewFile()
        val pw: PrintWriter = new PrintWriter(f)
        pw.write(data);
        pw.close();
        
        //Here I define my AWS Credentials - Do not upload these to GitHub-
        val accessKeyId = "xxxxxxxxxxxxxxxxxxxxxx" 
        val secretAccessKey = "xxxxxxxxxxxxxxxxxxxxxxxx"
        
        //Here I am building the AWS Credentials using the above values
        val cred: AWSCredentials = new BasicAWSCredentials(accessKeyId, secretAccessKey)
        
        //Here I am uploading the data to the S3 bucket
        val tm: TransferManager = new TransferManager(cred)        
        val upload: Upload = tm.upload("microdg-test", fileName, f)
        upload.waitForCompletion();
        println("Upload complete.");

        //Here I delete the temporary file
        f.getAbsoluteFile().delete();

        return s"Find the file at this location: $fileName"
    }
}