# Online Item Management – Spring Boot REST API

This is a simple **Spring Boot REST API** project for managing items.  
It demonstrates CRUD operations, request validation, and proper REST practices using **Spring Boot 3**, **Jakarta Validation**, and **Maven**.

---

## 🛠️ Technologies Used

- Java 17  
- Spring Boot 3.2.x  
- Spring Web  
- Jakarta Validation  
- Maven  
- REST APIs  

---

## 📂 Project Structure

online
├── src
│ ├── main
│ │ ├── java
│ │ │ └── com.online
│ │ │ ├── controller
      ├── exceptionclass
│ │ │ ├── model
│ │ │ ├── service
│ │ │ └── ApplicationMain.java
│ │ └── resources
│ │ └── application.properties
│ └── test
├── pom.xml
└── README.md



---

## 🚀 How to Run the Project

### 1. Prerequisites
- Java 17 installed  
- Maven installed  
- IDE (Eclipse / IntelliJ / VS Code)

2.Run using Maven

mvn spring-boot:run

OR build and run JAR:
mvn clean package
java -jar target/online-0.0.1-SNAPSHOT.jar

🌐 Base URL

(https://female-joanna-bhuvaneshwaridevenditran-9b1226cf.koyeb.app)

📌 API Endpoints

➕ Add Item

POST

(https://female-joanna-bhuvaneshwaridevenditran-9b1226cf.koyeb.app/api/items/add)

Request Body
{
  "name": "Pen",
  "description": "Blue ink pen",
  "price": 10.5
}

GET

(https://female-joanna-bhuvaneshwaridevenditran-9b1226cf.koyeb.app/api/items/1)



Validation Rules

name → must not be blank

price → must be greater than 0


❌ Validation Error Response (400)
{
  "name": "Name is required",
  "price": "Price must be greater than 0"
}


✅ Success Response (200)
{
  "name": "Pen",
  "description": "Blue ink pen",
  "price": 10.5
}

📦 Maven Dependencies

spring-boot-starter-web
spring-boot-starter-validation
spring-boot-starter-test


📄 Notes

Uses @Valid for request validation
Follows RESTful API standards
Proper HTTP status codes (200, 400, 500)




