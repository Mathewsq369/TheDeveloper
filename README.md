# Student Manager Web App

## Project Overview
The **Student Manager Web App** is a Java EE-based web application built using JSP, Servlets, and a MariaDB database. It provides an interface for managing student attendance, results, and user authentication.

## Project Structure
```
StudentManager/
├── nb-configuration.xml
├── pom.xml
├── src
│   └── main
│       ├── java
│       │   └── com
│       │       ├── mycompany
│       │       │   └── studentmanager
│       │       │       ├── JakartaRestConfiguration.java
│       │       │       └── resources
│       │       │           └── JakartaEE10Resource.java
│       │       └── studentmanager
│       │           ├── dao
│       │           │   └── UserDAO.java
│       │           ├── database
│       │           │   └── DatabaseConnection.java
│       │           ├── services
│       │           │   └── LoginService.java
│       │           ├── servlets
│       │           │   └── loginServlet.java
│       │           └── studentmanager
│       │               ├── JakartaRestConfiguration.java
│       │               ├── resources
│       │               │   └── JakartaEE10Resource.java
│       │               └── servlets
│       ├── resources
│       │   ├── config.properties
│       │   └── META-INF
│       │       └── persistence.xml
│       └── webapp
│           ├── attendance.css
│           ├── attendance.jsp
│           ├── dashboard.css
│           ├── dashboard.jsp
│           ├── login.css
│           ├── login.jsp
│           ├── META-INF
│           │   └── context.xml
│           ├── registration.css
│           ├── registration.jsp
│           ├── results.css
│           ├── results.jsp
│           ├── settings.css
│           ├── settings.jsp
│           └── WEB-INF
│               ├── beans.xml
│               ├── lib
│               │   └── mariadb-java-client-3.5.2.jar
│               └── web.xml

```

## Features
- **User Authentication**: Login system for students and instructors.
- **Attendance Management**: Mark and track student attendance.
- **Results Management**: Upload and view student results.
- **User Registration**: Admin can register students and instructors.
- **Settings Management**: Modify user settings.

## Installation & Setup
1. **Clone the repository**:
   ```sh
   git clone <repository-url>
   ```
2. **Set up the database**:
   - Install MariaDB.
   - Create a database and tables as per the schema.
   - Configure database connection in `config.properties`.
3. **Build the project using Maven**:
   ```sh
   mvn clean install
   ```
4. **Deploy on Tomcat**:
   - Copy the generated WAR file to Tomcat’s `webapps` directory.
   - Start Tomcat and access the application at `http://localhost:8080/StudentManager`.

## Technologies Used
- **Java EE (Jakarta EE 10)**
- **JSP & Servlets**
- **MariaDB**
- **Tomcat Server**
- **Maven**

## Contributors
- 

## License
This project is licensed under the MIT License 

