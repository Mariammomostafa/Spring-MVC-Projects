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
<h1>Hi >>>  ${username}</h1>
<h2>Send the Result to your email ....</h2>

<div align="center">
<form:form action="/com.selenium/process-email" method="post"  modelAttribute="emailDto" 
            onsubmit="return validateUsername()">

 <label>Name :</label>
 <form:input  id="email" path="email" /> <br><br>
 
 <input type="submit" value="send"> 
 <br><br>
 </form:form>
 </div>
 
</body>
</html>