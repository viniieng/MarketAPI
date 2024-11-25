# Marketplace API with Spring Boot, Lombok, and JPA

This is a simple <strong>HTTP API</strong> built using <strong>Spring Boot</strong>, <strong>Lombok</strong>, and <strong>JPA (Java Persistence API)</strong>. The API provides basic CRUD operations for managing <strong>products</strong> and <strong>sectors</strong> within a marketplace. The goal of this project is to offer a RESTful service that allows you to interact with these two entities.

## Technologies Used

<ul>
  <li><strong>Spring Boot</strong>: A Java framework for building production-ready applications.</li>
  <li><strong>Lombok</strong>: A Java library to reduce boilerplate code (getters, setters, constructors, etc.).</li>
  <li><strong>JPA (Java Persistence API)</strong>: Used for database interactions and object-relational mapping (ORM).</li>
</ul>

## API Endpoints

The API exposes the following HTTP methods for managing <strong>products</strong> and <strong>sectors</strong>:

### 1. **GET** `/api/products`  
   Retrieves all products stored in the database.

### 2. **GET** `/api/products/{name}`  
   Retrieves a specific product by its NAME.

### 3. **POST** `/api/products`  
   Creates a new product in the database.

### 4. **PUT** `/api/products/{id}`  
   Updates an existing product by its ID.

### 5. **DELETE** `/api/products/{id}`  
   Deletes a product by its ID.

---

### 6. **GET** `/api/sectors`  
   Retrieves all sectors in the marketplace.

### 7. **GET** `/api/sectors/{name}`  
   Retrieves a specific sector by its NAME.

### 8. **POST** `/api/sectors`  
   Creates a new sector.

### 9. **PUT** `/api/sectors/{id}`  
   Updates an existing sector by its ID.

### 10. **DELETE** `/api/sectors/{id}`  
   Deletes a sector by its ID.

---
