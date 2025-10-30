# Spring MVC maven project
- This project focus on Session using @SessionAttribute annotation
- First we set Session's attribute From ONLY model's attributes which created manually & both of them have the same name
  <p align="center">
  <img width="600" height="400" alt="1" src="https://github.com/user-attachments/assets/501e79c7-306f-4075-b686-cbfe93f649cb" />
  </p>
  <br>
- We can get Session's attributes from any controller in the project
- This annotation will push copy of it's attribute for each model of each request ONLY in the same controller
-  This annotation will NOT push copy of it's attribute for any model of other controllers
  <p align="center">
  <img width="807" height="551" alt="1" src="https://github.com/user-attachments/assets/f6ffedb1-f457-4f3b-bd64-87c74a94858f" />
  </p>
<p align="center">
<img width="1195" height="623" alt="1" src="https://github.com/user-attachments/assets/464e0b39-6441-4dd4-82db-916fc6d655a2" />
</p>

  ### Prerequisites
- Java 21
- spring Webmvc 6.2.12
- Validation-api (specification) & hibernate-validator (Implementation)
- Servlet-Api & Jstl
- For Mail Service : spring-context-support & angus-mail dependencies
- IDE (Eclips)
