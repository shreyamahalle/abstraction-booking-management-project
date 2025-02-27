# abstraction-booking-management-project
abstraction-booking-management-project

## **Project Overview**

The Core Java abstraction-booking-management-project is a basic Java application that demonstrates a booking management system. It utilizes object-oriented programming principles and simulates the interactions between customers, delivery agents, restaurants, and orders.

## **Features**

- Manage bookings for customers and restaurants.
- Simulate delivery agent assignments.
- Order and customer management using Java models.
- Simple and intuitive structure for learning and demonstration.

## **Installation and Setup**
- Prerequisites
- Java Development Kit (JDK) 21.
- An Integrated Development Environment (IDE) such as IntelliJ IDEA or Eclipse.
- Git (optional, for version control).

## **Steps**
- Clone the repository:
  ```shell
   git clone %%% "git@github.com:shreyamahalle/abstraction-booking-management-project.git" 
- Navigate to the project directory:
- cd core-java-if-booking-project
- Open the project in your preferred IDE.
- Compile and run the application:
- Locate Main.java.
- Run the file to start the application.

## **Code Structure**  
## **Packages Structure**
- com.booking.using.dowhile: Contains the main application logic (BookingDemoDoWhile.java).
- com.booking.using.dowhile.model: Includes the model classes:
  - Customer.java
  - DeliveryAgent.java
  - Order.java
  - Restaurant.java
- package names: com.booking.Customer.model
- package names: com.booking.DeliveryAgent.model
- package names: com.booking.Order.model
- package names: com.booking.Restaurant.model
- package names: com.booking.BookingDemoDoWhile.service

## **Functionality**
1. **Customer**
2. **DeliveryAgent**
3. **Order**
4. **Restaurant**



## **📝 Database Schema (POJO Classes)**
| **Entity**          | **Attributes** |
|---------------------|----------------------------------------------------------|
| **Customer**           | user id, name, username,monbileNo,city,area |
| **DeliveryAgent**          | id, name, city, mobileNo |
| **Order**         | id, name, city, mobileNo |
| **Restaurant**        |registerNo, name, City, Area |

---


#  Class Diagram
```mermaid
---
title: booking management project
---
classDiagram

 note " food order management "

 class Customer
 Customer : +int ID
 Customer : +String name
 Customer : +String city
 Customer : +int age
 Customer : +int contactNo

class Customer{
 +createPerson()
 +displayPerson()
}

  Customer --|> User  : Inheritance

 User : +int personId
 User : +String firstname
 User : +String lastName
 User : +int age
 User : +String gender
 User : +Long contactNo
 User : +Long alternateMobile
 User : +String address

class User{
 +createUser()
 +displayUser()
}

Doctor: +int doctorId
Doctor: +String firstName
Doctor: +String lastName
Doctor: +int age
Doctor: +String gender
Doctor: +String contactNo
Doctor: +String speciality
Doctor: +int experience

class Doctor{
 +createDoctor()
 +displayDoctor()
}

Hospital: +int hospitalId
Hospital: +String hospitalName
Hospital: +String address
Hospital: +Long contactNo
Hospital: +String emailId

class Hospital{
+createHospital()
+displayHospital()
}

Department: +int deptId
Department: +String deptName
Department: +doctorId
Department: +hosptitalId

class Department{
+createDepartment()
+displayDepartment()
}

Hospital <-- Department : Association
Doctor  <-- Department  : Assocciation

Appointment: +int appointmentId
Appointment: +int personId
Appointment: +int doctorId
Appointment: +int hospitalId
Appointment: +int deptId

class Appointment{
+createAppointment()
+displayAppointment()
+doctorAppointment()
+generalAppointment()
}

Appointment --|> DoctorAppointment : Inheritance
Appointment --|> GeneralAppointment : Inheritance

class DoctorAppointment{
+doctorAppointment()
}

class GeneralAppointment{
+generalAppointment()
}

DoctorAppointment : +String speciality

GeneralAppointment : reasonOfAppointment

Appointment --> Person : Association
Appointment --> Doctor : Association
Appointment --> Hospital : Association
Appointment --> Department : Association

Prescription : +int prescriptionId
Prescription : +String prescriptionDetails
Prescription : +int personId

class Prescription{
+createPrescription()
+displayPrescription()
}

Prescription --> Person : Association

Billing : +int billId
Billing : +int bill
Billing : +int totalBill
Billing : +int personId

class Billing{
+createBilling()
+displayBilling()
}

Billing --> Person : Association

```
