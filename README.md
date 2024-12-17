# Spring Boot RESTful Application
A simple web application that uses Spring Boot for the backend and JQuery (AJAX) for the front-end.
MySQL database is being used with a single table named users2. The communication between
the front and the back-end is done through RESTful API exchaning JSON messages.

## Features
- Retrieve and display all users from the database in a table.
- Add a new user using a form.
- Remove a user from the database with a delete button.
- AJAX-based front-end communication with RESTful APIs.

## Prerequisites
- Java 8 or above installed
- Maven installed (implemented through IntelliJ)
- MySQL database set up (download mysql or run through docker)

## Database Configuration
- Open application.properties in /resources folder.
- Add the following properties
```bash
spring.datasource.url=jdbc:mysql://localhost:3306/<your_database_name>
spring.datasource.username=<your_username>
spring.datasource.password=<your_password>
spring.jpa.hibernate.ddl-auto=update
```
- Extra properties
```bash
spring.jpa.show-sql=true
spring.jpa.generate-ddl=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
```

## Access the Front-End
After running the application, open the src/main/resources/static/index.html in your broweser.
Available at http://localhost:8080/

## API Endpoints
### Add User
- URL: http://localhost:8080/api/addUser
- Method: POST
- Headers: Content-Type: application/json
- Request Body (JSON):
```bash
{
  "name": "Giorgos",
  "surname": "Vas",
  "gender": "M",
  "birthdate": "1997-09-09"
}

```
### Delete User
- URL: http://localhost:8080/api/deleteUser/{id}
- Method: DELETE
- To delete a user with id=6, the URL would be:
  - http://localhost:8080/api/deleteUser/5
