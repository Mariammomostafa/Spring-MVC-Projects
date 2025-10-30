<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style type="text/css">

.color{
color: red;
size : 20px;

}

</style>
</head>
<body>

<h1>Hi  <span class="color">${userDto.name}</span> </h1> 


<div align="center">

<h1>Email Send Successfully to : ${emailDto.email} </h1> <br>

</div>


<a href="/com.selenium/" class="error">Try with somebody else ..</a>
</body>
</html>