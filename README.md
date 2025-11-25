# Currency_Converter-
A simple and efficient Currency Converter application built using Java, JDBC, MySQL, and Maven. The project demonstrates backend connectivity, modular design using DAO &amp; Model classes, and clean UI-based currency conversion.
A Java-based GUI Currency Converter application built using:
--> Swing GUI
--> MySQL Database (JDBC)
--> DAO Layer
--> OOP Concepts
--> Multithreading
--> Strategy Design Pattern




✔ Convert currency using live exchange rates stored in DB
✔ GUI built using Swing
✔ DAO layer for database access
✔ Custom Exception Handling
✔ Multithreading using Thread class
✔ OOP principles (Inheritance, Polymorphism, Abstraction, Encapsulation)
✔ Strategy Design Pattern for conversion logic

## PROJECT STRUCTURE
CurrencyConverterGUI/
│
├── src/
│   ├── main/
│   │   ├── App.java
│   │   ├── gui/
│   │   │   └── MainFrame.java
│   │   ├── model/
│   │   │   ├── Currency.java
│   │   │   ├── ConversionStrategy.java
│   │   │   └── DefaultConversionStrategy.java
│   │   ├── dao/
│   │   │   ├── DBConnection.java
│   │   │   ├── CurrencyDAO.java
│   │   │   └── CurrencyDAOImpl.java
│   │   ├── services/
│   │   │   └── ConverterService.java
│   │   └── exceptions/
│   │       └── CurrencyNotFoundException.java
│   │
│   └── resources/
│       └── application.properties
│
├── lib/
   └── mysql-connector-j-9.1.0.jar


## Technologies Used

--> Java 17+
--> Swing (GUI)
--> MySQL Database
--> JDBC
--> OOP Concepts
--> MySQL Workbench/XAMPP

## CONFIGURATION (Appliaction.properties)

Located in src/main/resources/:

db.url=jdbc:mysql://localhost:3306/university
db.username=root
db.password=13579224680@Sourabh


## Oops Concepts Implmented
OOP Concept	Where Used
Abstraction	            -->       CurrencyDAO & ConversionStrategy interfaces
Polymorphism	          -->       Switching strategies & DAO implementations
Inheritance	Interface   -->       implementation
Encapsulation	Currency  -->       model fields
Exception Handling	    -->       CurrencyNotFoundException
Multithreading	        -->       ConverterService extends Thread

## IMPLEMENTATION OF JDBC FOR CONNECTIVITY

1. DBConnection Class (Singleton Pattern)

A dedicated class DBConnection handles opening a database connection.
This ensures:
Only one connection is used across the project
Clean, reusable DB access
Centralized configuration
Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);


This class reads details such as:
Database URL
Username
Password

from application.properties.

✅ 2. DAO Layer Uses the Connection

The CurrencyDAOImpl class uses:
Connection conn = DBConnection.getConnection();
to run SQL queries using PreparedStatement.

Examples: 

Fetch all currencies
Get conversion rate
PreparedStatement ps = conn.prepareStatement("SELECT * FROM currency");

✅ 3. JDBC API Used Internally

The project uses:
Connection
PreparedStatement
ResultSet
SQLException
This ensures secure, efficient, and parameterized SQL queries.




