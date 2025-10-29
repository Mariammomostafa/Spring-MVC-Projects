<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
     <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style type="text/css">

.color{
color: red;
font-size: 20px bold ;
font-family: serif;

}

</style>
</head>
<body>


<br><br><br>
<div align="center">
<h1>Login Form</h1> <hr> <br><br>

<form:form action="/springMvc_InitBinder_Validator/process-login" method="post" modelAttribute="loginDto">


	<label > User Name  : </label>
	<form:input  path="username"/>
	<form:errors path="username" cssClass="color"></form:errors>
<br>

<p>
<label > Password  : </label>
<form:input path="password"/>
</p>
<label>termAndCondition  : </label>
<form:checkbox path="termAndCondition"/><br><br>

<label>Food : </label>
Pizza <form:checkbox path="food" value="Pizza"/><br><br>

<input type="submit" value="login">

</form:form>
</div>

</body>
</html>