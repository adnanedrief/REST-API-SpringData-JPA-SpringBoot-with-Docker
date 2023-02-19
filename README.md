# REST API with Spring Data JPA and Spring Boot with Docker
This project contains a RESTful API for managing products using Spring Data JPA and Spring Boot with Docker.
## Technologies
This project uses the following technologies:
- Java
- Spring Boot & Spring Data JPA
- Docker

## Prerequisites
Before you can run this project, you must have the following software installed on your system:

- Java Development Kit (JDK) version 17
- Docker

## Getting Started

To get started with this project, follow these steps:

1. Clone the repository to your local machine.

2. Open a terminal window and navigate to the root directory of the project.

3.  Build the Docker image by running the following command:

```docker build -t rest-api-springdata-jpa-springboot .```
 
4. Once the image has been built, start the Docker container by running the following command:

``` docker run -p 3001:8080 rest-api-springdata-jpa-springboot```

You can now access the REST API by opening a web browser and navigating to http://localhost:3001. Alternatively, you can use a tool like cURL,Postman to make requests to the API.

##  API Endpoints
The REST API exposes the following endpoints:

1. **GET /products:** Returns a list of all products.
2. **GET /product/{id}:** Returns a single product by ID.
3. **POST /product/add:** Adds a new product to the system.
4. **DELETE /product/delete/{id}:** Deletes a product by ID.

All endpoints return JSON data in the response body.
