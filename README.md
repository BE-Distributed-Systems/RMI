# RMI
 Remote Method Invocation for BE practical assignment

 
## Setup
 
 - Make sure the code is compiling with Java 1.8 [download](https://www.openlogic.com/openjdk-downloads?field_java_parent_version_target_id=416&field_operating_system_target_id=436&field_architecture_target_id=391&field_java_package_target_id=396)
 - Make sure the eclipse is installed in the system [download](https://www.eclipse.org/downloads/download.php?file=/oomph/epp/2023-03/R/eclipse-inst-jre-win64.exe)
 - Right click on project in eclipse Go to properties->Java Compiler -> Set Java Compliance to 1.8


## Running the program 
 - Open a terminal and run edu.ait.ds.server.SearchServer
 - Open another terminal run edu.ait.ds.client.ClientRequest
 - ClientRequest should call SearchServer and get the response. 
 - Server should started once and keep running until you close the server terminal but client should run every time.
 
## Result
 - Using Java RMI Client request is processed and serve by Server. 
 - This is the oldest way of client server communication.
 