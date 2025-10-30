# Spring Mvc Maven project
-This project focus on Email Service 
## Features
### Sending Email
- Use Session to set the connection with Gmail server through Properties obj
  <p align="center">
    <img width="929" height="519" alt="1" src="https://github.com/user-attachments/assets/98e7e298-f5b1-4b30-84f5-be5688630424" />
  </p>
- use MimeMessage class to send email from app's email to users
  <p align="center">
    <img width="1139" height="699" alt="1" src="https://github.com/user-attachments/assets/36bbf961-7ac4-427f-8e65-f20dbcc7d8c9" />
  </p>
#### Due to Gmail's Security , you have to  to create password for your gmail account due to it's NOT acceptable for app to register with actual password
- Gmail is very secure & if we want to configure Gmail with our app , we need to turn on less secure app feature inside the Gmail But this feature Not allowed any more , so the alternative way is :
- Turn on 2 -step-verification feature in your Gmail account
- generate new app password due to the default Gmail password will NOT work
<p align="center">
<img width="600" align="center" height="500" alt="1" src="https://github.com/user-attachments/assets/2ef4e9fb-cc44-434f-9237-9bec6e663b78" />
</p>
<br><br>
<p align="center">
<img width="683" height="457" alt="1" src="https://github.com/user-attachments/assets/8d1c4650-5664-4bec-b03a-4cd0fcdde566" />
</p>
<br><br>
<p align="center">
<img width="600" height="500" alt="1" src="https://github.com/user-attachments/assets/f843630b-47b9-4a8d-8a70-b39fc739f768" />
</p>
<br><br>

### Prerequisites
- Java 21
- spring Webmvc 6.2.12
- Validation-api (specification) & hibernate-validator (Implementation)
- Servlet-Api & Jstl
- For Mail Service : spring-context-support & angus-mail dependencies
- IDE (Eclips)
