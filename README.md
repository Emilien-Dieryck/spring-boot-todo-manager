# Spring Boot Todo Manager

Simple REST API built with Spring Boot to manage a list of todos.
This project is a learning project aimed at understanding the fundamentals of Spring Boot, REST APIs, and good backend development practices.

---

## Features

- Create a todo
- List all todos
- Mark a todo as completed
- Delete a todo
- In-memory storage (no database)

---

## Tech Stack

- Java 17
- Spring Boot 3
- Spring Web (REST / MVC)
- Maven
- Lombok
- Postman (API testing)

---

## Project Structure


src/main/java/com/example/todomanager
├── controller
│   └── TodoController.java
├── service
│   └── TodoService.java
├── model
│   └── Todo.java
└── TodoManagerApplication.java

---

## Run the Application

### Prerequisites

- Java 17 or higher
- Maven

### Start the application

./mvnw spring-boot:run

or

mvn spring-boot:run

The application will start on:

http://localhost:8080

---

## API Endpoints

Method | Endpoint | Description
POST | /todos?title= | Create a new todo
GET | /todos | Get all todos
PUT | /todos/{id}/complete | Mark a todo as completed
DELETE | /todos/{id} | Delete a todo

---

## Test the API with Postman

You can test the API using Postman.

Example request:

POST http://localhost:8080/todos?title=Learn Spring Boot

Recommended: define a Postman collection variable:

baseUrl = http://localhost:8080

Then use:

{{baseUrl}}/todos

---

## Learning Objectives

This project helps to understand:

- Spring Boot project structure
- REST controllers with @RestController
- Dependency Injection
- Service layer separation
- Clean project architecture
- Git & GitHub workflow
- API testing with Postman

---

## Possible Improvements

- Use DTOs and JSON request bodies
- Add validation (@NotBlank, @Valid)
- Add global exception handling
- Add persistence with Spring Data JPA
- Add unit and integration tests
- Add authentication and security

---

## Author

Emilien Dieryck

---

## License

This project is for learning purposes only.
