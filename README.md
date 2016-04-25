# DEV-FYP-AWS-Storage-Service
This is a Microservice for persisting data objects to an AWS S3 bucket

**MicroDG -  AWS-Storage-Service **

Author: *David Brady*
Date:   *25/04/2016*

This is a Microservice for persisting data objects to an AWS S3 bucket

To run this service locally:
* From within the BETA-AWS-Storage-Service Directory
'''
sbt clean compile
sbt test
sbt run
'''
* This will compile the service, test it and run it. 
* Then open a browser, navigate to localhost:8084 proceeded by the desired endpoint
* A list of endpoints can be found at: localhost:8084/hello

Alternatively, you can open this source code in the Typesafe Activator UI:
* From within the BETA-AWS-Storage-Service Directory
'''
activator ui
'''

**PLEASE NOTE**
In order to run this service you will need to include your own:
* Client ID
* Secret

**PLEASE NOTE**
This project contains work that does not belong to me:
* src/main/scala/support/CORSSupport

Title: joseraya/CorsSupport.scala
Author: Jose Raya
Date: 19/04/2016
Code version: 1.0 
Type: Source Code
Availability: https://gist.github.com/joseraya/176821d856b43b1cfe19






