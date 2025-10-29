<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
          <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<!-- for client side validatopn -->
<!--  
<script type="text/javascript">
  
  function validateUsername(){
   var username = document.getElementById('name').value;
   if(username.length <=3){
	   
	   alert("your name should have at least one character ... ");
	   return false;
   }else{
	   return true;
   }
  }
</script>
-->

</head>
<body>

<div align="center">
<br><br>
<h1>Love Calculator</h1>

<br> <hr><br><br>

<form:form action="/com.selenium/process-register" method="post"  modelAttribute="dto" 
            onsubmit="return validateUsername()">

 <label>Name :</label>
 <form:input  id="name" path="name" />
 <br><br>

 <label>User Name :</label>
 <form:input  id="crushName" path="username" />
 <br><br>
 
  <label>Password :</label>
 <form:input  id="password" path="password" />
 <br><br>
 
   <label>Country Name :</label>
 <form:select   path="countryName" >
 
 <form:option value="egy" label="Egypt"></form:option>
 <form:option value="Fay" label="Fayoum"></form:option>
 <form:option value="alex" label="Alexandria"></form:option>
 <form:option value="KSA" label="Sudi arabia"></form:option>
  </form:select>
 <br><br>
 
 <label>Hobbies :</label>
 Walking : <form:checkbox path="hobbies" value="walk"/>
 Reading : <form:checkbox path="hobbies" value="read"/>
 traveling : <form:checkbox path="hobbies" value="travel"/>
 swimming : <form:checkbox path="hobbies" value="swim"/>
  <br><br>
  
  <label>Gender :</label><br>
  Female : <form:radiobutton path="gender" value="female"/>
  Male : <form:radiobutton path="gender" value="male"/>
   <br><br>
 <input type="submit" value="submit">
 
</form:form>

</div>

</body>
</html>