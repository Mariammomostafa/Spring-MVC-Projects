<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
    
      <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div align="center">
<br><br>
<h1>Love Calculator</h1>

<br> <hr><br><br>

<form:form action="/com.selenium/process" method="post"  modelAttribute="dto">

 <label>Your Name :</label>
 <form:input  id="name" path="name" />
 <br><br>

 <label>crush Name :</label>
 <form:input  id="crushName" path="crushName" />
 <br><br>
 
 <input type="submit" value="submit">
 
</form:form>

</div>

</body>
</html>