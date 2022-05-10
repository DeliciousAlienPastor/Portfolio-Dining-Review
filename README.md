# Dining Review API

This project is a part of a small **Spring Boot** introductory course that I completed in [Codecademy](https://www.codecademy.com/projects/portfolio/dining-review-api). Spring Boot is a backend framework in Java which is used extensively in web development for creating production ready applications without the hassle of extensive configurations ([Documentation](https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/)).

## The objectives of the project:
- Constructing a RESTful web API with data persistence using Spring and Spring Data JPA
- Using Spring Initializr to generate the initial Java project
- Configuring application properties for certain dependencies, including the H2 embedded database
- Defining the entities that comprise this application scenario
- Defining the repositories that enable creating, updating, and querying these different entities
- Defining the API contracts that will enable this application scenario
- Leveraging the convenience of Lombok
- Using cURL and Postman to test API scenarios

## Running the project:
To begin with, the entire codebase needs to be cloned and made sure that the system where the project will run has the latest JDK (8 and above is fine). To run the project, the `DiningApplication.java` file has to be executed. To test the API's, any API testing software such as Postman, or terminal (cURL) can be used. The base API path is **`api/v1/`**.
