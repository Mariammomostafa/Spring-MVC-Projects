# FriendShip Calculator Compelete Project
This is spring mvc maven project include lot of features like --> validators , Editors , Sending Email , Send Feedback
## Features
### Validation
- EmailValidator class which validate if email is empty & end with @selenium.com
- UserNameValidator class which validate username if it's empty , whitespaces or contains underscore or not
### Editor
- CustomNameEditor class which edit username & convert it to uppercase letters
### Sending Email
- use JavaMailSender Interface to make the connection with Gmail server & allow to send email from app's email to users
- Replace default mail inside mail.properties file with your actual mail
#### Due to Gmail's Security , you have to  to create password for your gmail account due to it's NOT acceptable for app to register with actual password
- Turn on 2 -step-verification feature in your Gmail account
- generate new app password due to the default Gmail password will NOT work
<p align="center">
<img width="600"  height="500" alt="1" src="https://github.com/user-attachments/assets/2ef4e9fb-cc44-434f-9237-9bec6e663b78" />
</p>
<br><br>
<p align="center">
<img width="600" height="400" alt="1" src="https://github.com/user-attachments/assets/8d1c4650-5664-4bec-b03a-4cd0fcdde566" />
</p>
 <br><br>
<p align="center">
<img width="600" height="500" alt="1" src="https://github.com/user-attachments/assets/f843630b-47b9-4a8d-8a70-b39fc739f768" />
</p>
 <br><br>
 
### Send Feedback
- user can send feedback to the application's mail
<br><br>
<p align="center">
 <img width="600" height="500" alt="1" src="https://github.com/user-attachments/assets/e22efd79-2cb2-4b21-a24e-ad6286ef904d" />
</p>

### Prerequisites
- Java 21
- spring Webmvc 6.2.12
- Validation-api (specification) & hibernate-validator (Implementation)
- Servlet-Api & Jstl
- For Mail Service : spring-context-support & angus-mail dependencies
- IDE (Eclips)
