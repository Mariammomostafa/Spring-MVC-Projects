<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
         <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<br><br><br>
<div align="center">
<h1>Bill Form</h1> <hr> <br><br>

<form:form action="/springMvc_CreditCardConverter/process-bill" method="post" modelAttribute="billDto">

<p>
	<label >  Amount : </label>
	<form:input  path="amount"/>
	<form:errors path="amount" cssClass="color" />
</p>

<p>
<label > Currency  : </label>
<form:input path="currency"/>
</p>
<label > Date  : </label>
<form:input path="date"/> <br> <br>


<label > CreditCard  : </label>
<form:input path="creditCard"/> <br> <br>


<input type="submit" value="pay">

</form:form>
</div>

</body>
</html>