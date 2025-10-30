<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>Hi  <span style="color: red">${dto.name} </span> </h1> 



<div align="center">

<h1>Email Send Successfully to : ${emailDto.email} </h1>

</div>

<a href="/com.selenium/">Try with somebody else ..</a>
</body>
</html>