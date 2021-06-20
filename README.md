# Microservices Communication Using Eureka Discovery Service
Every Microservice is a RESTful Component. To communicate with a microservice we need to have the IP address and Port Number on which that microservice is running. With these details (IP Address and Port Number) we can make a REST call to that microservice.

🔴 **Problem -** But when a microservice is published in Cloud (menas when it runs in a Docker Container), then we do not know -  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; - How many instances of that microservice are running :grey_question:  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; - On which IP Address and Port Numbers these instances are running :grey_question:  
As in cloud based on the load number of instances of the microservices increases or decreases.

<br/>

## :thinking: So in this type of scenario How to setup communication between microservices ?  
🟢 **Solution -**

