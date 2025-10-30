# Spring MVC maven project
- This project focus on Session using @SessionAttribute annotation
- First we set Session's attribute From ONLY model's attributes which created manually & both of them have the same name
  <p align="center">
   <img width="731" height="453" alt="1" src="https://github.com/user-attachments/assets/68e25d5f-fbe3-4631-9af2-18088648f929" />
  </p>
  <br>
- We can get Session's attributes from any controller in the project
- This annotation will push copy of it's attribute for each model of each request ONLY in the same controller
-  This annotation will NOT push copy of it's attribute for any model of other controllers

  ### Prerequisites
- Java 21
- spring Webmvc 6.2.12
- Validation-api (specification) & hibernate-validator (Implementation)
- Servlet-Api & Jstl
- For Mail Service : spring-context-support & angus-mail dependencies
- IDE (Eclips)
