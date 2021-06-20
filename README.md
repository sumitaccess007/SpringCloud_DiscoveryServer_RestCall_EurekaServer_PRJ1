# Microservices Communication Using Eureka Discovery Service
Every Microservice is a RESTful Component. To communicate with a microservice we need to have the IP address and Port Number on which that microservice is running. With these details (IP Address and Port Number) we can make a REST call to that microservice.

🔴 **Problem -** But when a microservice is published in Cloud (menas when it runs in a Docker Container), then we do not know -  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; - How many instances of that microservice are running :grey_question:  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; - On which IP Address and Port Numbers these instances are running :grey_question:  
As in cloud based on the load number of instances of the microservices increases or decreases.

<br/>

## :thinking: So in this type of scenario How to setup communication between microservices dynamically ?  
🟢 **Solution -** To make this requirement fulfill **Service Discovery** concept is introduced in Spring Cloud.

<br/>

## What is Service Discovery ?
Service Discovery is the process of one service dynamically discovering the network location (IP Address and Port Number) of another service to communicate with it as in a Distributed System typically comprises a large number of services which communicates with each other to perform certain operations.

:star: In conventional **Service Oriented Architecture (SOA)** we can affort to maintain the network locations of services in configuration files as they are deployed in on-premise data centers and network locations would hardly change or change infrequently.
However in **Cloud Based Microservices Architecture** this approach is nearly inpossible due to following reasons -  
:heavy_check_mark: Increased number of services.  
:heavy_check_mark: Dynamically assigned network locations.

<br/>

## Solutions Provided By Spring Cloud  
**Spring Cloud** provides **Service Registry and Discovery** features, as usual, with multiple options.
* Eureka
* Zookeeper
* Cloud Foundry 
* Consul

:memo: This example is implemented with *Eureka Discovery Service*  

</br>

## Project Structure
Services | Github Links
| :--- | :---
Eureka Discovery Server  | https://github.com/sumitaccess007/SpringCloud_DiscoveryServer_RestCall_EurekaServer_PRJ1
Discovery Client (Doctor Service)  | https://github.com/sumitaccess007/SpringCloud_DiscoveryClient_RestCall_DoctorService_PRJ1
Discovery Client (Patient Service)  |https://github.com/sumitaccess007/SpringCloud_DiscoveryClient_RestCall_PatientService_PRJ1

</br>

Hi

