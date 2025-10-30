<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<div>
<h1>Your Are successfully Registered ... </h1>

Name : ${dto.name}  <br><br>
UserName : ${dto.username}  <br><br>
Password : ${dto.password} <br><br>
Country Name : ${dto.countryName}  <br><br>
Hobbies :   <br><br>

<c:forEach items="${dto.hobbies}" var="hobby">
  ${hobby} <br>
</c:forEach>

<br><br>

 Gender : ${dto.gender}   <br><br>


</div>

</body>
</html>