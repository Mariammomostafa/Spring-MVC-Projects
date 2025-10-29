<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
        <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
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

User Name : ${dto.username} <br><br>

Password : ${dto.password} <br><br>

Email : ${dto.email}  <br><br>

Country : ${dto.country} <br><br>

Hobbies :  
<c:forEach  var="item" items="${dto.hobbies}">

  ${item} - 
</c:forEach> 
<br><br>

Gender : ${dto.gender}<br><br>
<a href="/springMvc_InitBinder_Validator" class="color"> Home </a><br><br>
<a href="/springMvc_InitBinder_Validator/login" class="color"> Login </a>
</body>
</html>