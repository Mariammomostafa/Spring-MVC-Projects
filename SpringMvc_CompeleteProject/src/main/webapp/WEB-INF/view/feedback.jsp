<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
    
              <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<style type="text/css">

.error{
color: red;
text-align: left;
position: fixed;
margin-left: 30px;
}

</style>

</head>
<body>

<div align="center">
<br><br>
<h1>FeedBack</h1>

<br> <hr><br><br>

<form:form action="/com.selenium/process-feedback" method="post"  modelAttribute="feedbackDto">

 <label>Name :</label>
 <form:input  id="name" path="name" />
 <form:errors path="name" cssClass="error"></form:errors>
 <br><br>

 <label>Email :</label>
 <form:input   path="email" />
  <form:errors path="email" cssClass="error"></form:errors>
 <br><br>
 
  <label>Feedback :</label>
 <form:textarea  id="feedback" path="feedback" />
 <br><br>
 
 
   
 <input type="submit" value="submit">
 
</form:form>

</div>

</body>
</html>