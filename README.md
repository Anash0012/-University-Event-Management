# University Event Management #

>## Frameworks and Language Used
* java
* Springboot
* Maven
* Hibernate

>## Data flow
In this project, we have four layers-
* **Controller** - The controller layer handles the HTTP requests, translates the JSON parameter to object, and authenticates the request and transfer it to the business (service) layer. In short, it consists of views i.e., frontend part.
* **Service** -The business layer handles all the business logic. It consists of service classes and uses services provided by data access layers.
* **Repository** - This layer mainatains the h2-database thing on which CRUD operations are performed
* **Model** - This layer consists basically the class level things- the various classes required for the project and these classes consists the attributes to be stored.

>## Data Structure used in my project
User Model: The User model represents the data structure for storing user information. It typically includes attributes such as userId, username, email, password, etc.

>## Project Summary

The above project implements a UniversityEvent Management project in which the endpoints provided are:-

* Add student
* update student
* department
* delete student
* Get all students
* Get student by Id
* Add event
* Update event
* Delete event
* Get All events by date

Also we have added validation on below ->
* Validation on age(between 18 -25)
* First name(first letter should be capital)
*  Department(datatype of variable department should be Enum and not string Enum should support department names line ME , ECE , civil , CSE). 
