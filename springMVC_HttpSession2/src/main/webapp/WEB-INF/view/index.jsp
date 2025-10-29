<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>


<html>
<body>
<h1 align="center">Hello to session attribute app</h1>
<hr>

First Name : ${firstName}  <br>

Second Name : ${secondName}  <br><br><br>

Address : ${address}   <br><br>

First Name value fetched from Request Scope is : ${requestScope.firstName}<br><br>
First Name value fetched from Session Scope is : ${sessionScope.firstName}<br><br>


<a href="/love_calculator_sessionAttribute/${next}">${next} request</a>
</body>
</html>
