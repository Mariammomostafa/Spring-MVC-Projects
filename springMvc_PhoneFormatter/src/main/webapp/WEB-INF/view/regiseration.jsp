<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
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
<h1>Registeration Form</h1> <hr> <br><br>

<form:form action="/spring_mvc_PhoneFormatter/process-register" modelAttribute="dto">

<label class="color"> User Name  : </label>
<form:input  id="username" path="username"/>
<form:errors path="username" cssClass="color" /><br><br>

<label class="color"> Password  : </label>
<form:input path="password"/>
	<form:errors path="password" cssClass="color" /><br><br>

<label class="color">Country :   </label>
<form:select path="country"><br><br>

  <form:option label="Egypt" value="Egypt"></form:option>
  <form:option label="KSA" value="Suadi Arabia"></form:option>
  <form:option label="USA" value="America"></form:option>
  <form:option label="UAE" value="Emarate"></form:option>

</form:select>
<br> <br>

<label class="color"> Hobbies :  </label>
Walk :<form:checkbox value="walk" path="hobbies"/>
Swimming :<form:checkbox value="Swimming" path="hobbies"/>
Reading : <form:checkbox value="Reading" path="hobbies"/> <br> <br>

<label class="color"> Gender :  </label>
Female :<form:radiobutton path="gender" value="female"/>
Male : <form:radiobutton path="gender" value="male"/>
<br> <br>

<label>Communication : </label> <br><br>

Email : <form:input path="communicationDto.email"/>
<form:errors path="communicationDto.email" cssClass="color" /><br><br>


Phone : <form:input path="communicationDto.phone"/>
<form:errors path="communicationDto.phone" cssClass="color" />
<br><br>


<input type="submit" value="submit">

</form:form>
</div>
</body>
</html>