# Spring Mvc Maven project
-This project focus on Email Service 
## Features
### Sending Email
- use JavaMailSender Interface to make the connection with Gmail server & allow to send email from app's email to users
- Replace default mail inside mail.properties file with your actual mail
#### Due to Gmail's Security , you have to  to create password for your gmail account due to it's NOT acceptable for app to register with actual password
- Gmail is very secure & if we want to configure Gmail with our app , we need to turn on less secure app feature inside the Gmail But this feature Not allowed any more , so the alternative way is :
- Turn on 2 -step-verification feature in your Gmail account
- generate new app password due to the default Gmail password will NOT work
<img width="653" height="409" alt="1" src="https://github.com/user-attachments/assets/2ef4e9fb-cc44-434f-9237-9bec6e663b78" />
<br><br><br><br>
<img width="683" height="457" alt="1" src="https://github.com/user-attachments/assets/8d1c4650-5664-4bec-b03a-4cd0fcdde566" />
<br><br><br><br>

<img width="945" height="829" alt="1" src="https://github.com/user-attachments/assets/f843630b-47b9-4a8d-8a70-b39fc739f768" />
<br><br><br><br>

### Prerequisites
- Java 21
- spring Webmvc 6.2.12
- Validation-api (specification) & hibernate-validator (Implementation)
- Servlet-Api & Jstl
- For Mail Service : spring-context-support & angus-mail dependencies
- IDE (Eclips)
