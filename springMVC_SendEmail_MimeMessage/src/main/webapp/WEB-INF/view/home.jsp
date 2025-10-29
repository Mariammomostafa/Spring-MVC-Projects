<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
    
      <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

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
<h1>Love Calculator</h1>

<br> <hr><br><br>

<form:form action="/com.selenium/process" method="post"  modelAttribute="userDto">

 <label>Your Name :</label>
 <form:input  id="name" path="name" />
 <form:errors path="name" cssClass="error"></form:errors>
 <br><br><br>

 <label>crush Name :</label>
 <form:input  id="crushName" path="crushName" />
 <form:errors path="crushName" cssClass="error"></form:errors>
 <br><br><br>
 
 <form:checkbox path="termAndCondition"/>
 <label>I am agreeing that is for fun </label>
 <form:errors path="termAndCondition" cssClass="error"></form:errors>
 <br><br><br>
 
 
 <input type="submit" value="submit">
 
</form:form>

</div>

</body>
</html>