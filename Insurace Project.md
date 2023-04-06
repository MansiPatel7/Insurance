Insurance Management Platform:
The Insurance Management Platform is a comprehensive application built using Spring Boot and Java that allows users to manage insurance policies, clients, and claims through RESTful APIs.

Features:
1.CRUD (Create, Read, Update, Delete) operations for clients, insurance policies, and claims, allowing for seamless management of data.
2.Ability to fetch all clients, insurance policies, and claims, providing a comprehensive view of the entire system.
3.Fetching specific clients, insurance policies, and claims by ID, enabling quick and efficient retrieval of relevant data.
4.Exception handling and validation mechanisms to ensure proper API usage and maintain data integrity, providing robustness and reliability to the system.

Structure:
Insurance [boot] [devtools] [Insurance main]
 src/main/java
  com.project >DemoApication.java
  com.project.Controller >Claim Controller.java >ClientController.java >Insurance Controller.java
  com.project.Entity > Claim.java >Client.java > Insurance.java >MessageforException.java
  com.project.Exception >ExceptionResponseScreen.java > ManagementException.java
  com.project.repository >claimRepository.java  >clientRepository.java >insuranceRepository.java
  com.project.service >ClaimService.java >ClientService.java > ImplClaimService.java >ImplClient.java >ImplinsuranceService.java  >InsuranceSerivce.java
  src/main/resources >Static >Templates >application.properties
  src/test/java
  JRE System Library [JavaSE-17]
  Maven Dependencies
  target/generated-sources/annotations
  target/generated-test-sources/test-annotations
  src
  target
    >ww HELP.md
    >mvnw
    >mvnw.cmd
    >pom.xml
    
 It includes the following main packages:

Controllers: Contains the RESTful API endpoints that handle incoming requests and return responses.
Entity: Contains the entity classes, including Client, InsurancePolicy, Claim and message for exception class which is not a entity class with their respective properties and relationships.
Repositories: Contains the Spring Data JPA repositories for each entities, providing data access and persistence.
Services: Contains the business logic and services that handle data processing and manipulation.
Exceptions: Contains custom exception classes for handling errors and providing meaningful error messages.
The application.properties file contains the configuration for the mysql database which can be easily modified to suit database requirements.
    
Running the Application Locally:

1.Clone the GitHub repository to your local environment.
2.Build and run the project as Spring boot app using your preferred IDE.
3.Access the APIs at the following endpoints:
   >Clients: http://localhost:8997/api/clients
   >Insurance Policies: http://localhost:8997/api/policies
   >Claims: http://localhost:8997/api/claims
