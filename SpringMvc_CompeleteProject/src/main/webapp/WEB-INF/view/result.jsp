<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
	
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %><!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<div align="center">
		<br>
		<br>
		<h1>Love Calculator predicts :  </h1>

		<br>
		<hr>
		<br>
      <h3> ${userDto.name} and ${userDto.crushName} are : ${userDto.appResult} </h3>
				<br>
				
	</div>
	<!-- 	<a href="/com.selenium/sendEmail"> Send Result to Your Email </a> -->
	
     <a   href="<c:url value="/sendEmail" />">Send Result to Your Email</a>
</body>
</html>