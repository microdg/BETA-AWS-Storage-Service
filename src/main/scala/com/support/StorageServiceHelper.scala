package com.support
import scala.io.{Source}
import java.util.Calendar
import java.time.LocalDate

object ProcessControllerHelper {
    
    //Function: A helper function to generate a date tag
    def getDateFileTag(): String = {
      val time = LocalDate.now
      val dateFileTag = time.toString()
      return dateFileTag
    }
  
  	//Function: A helper function to generate a time tag
    def timeStamp(): String = {
       val time = Calendar.getInstance.getTimeInMillis().toInt
       return time.toString()
    }
        
    
    
}