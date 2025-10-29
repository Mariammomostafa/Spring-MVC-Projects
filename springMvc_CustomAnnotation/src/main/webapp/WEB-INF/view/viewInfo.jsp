<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
        <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

User Name : ${dto.username} <br><br>

Password : 
<c:forEach var="item" items="${dto.password}">

${item}

</c:forEach>
 <br><br>

Age : ${dto.age}  <br><br>
Country : ${dto.country} <br><br>

Hobbies :  
<c:forEach  var="item" items="${dto.hobbies}">

  ${item} - 
</c:forEach> 
<br><br>

Gender : ${dto.gender}

</body>
</html>