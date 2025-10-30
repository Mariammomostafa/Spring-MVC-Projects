<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style type="text/css">

.error{
color: red;
text-align: left;
position: fixed;
margin-left: 30px;
}

</style>

</head>
<body>

<h1> Welcome ${feedbackDto.name}  your feedback send successfully</h1><br><br>

<a   href="/com.selenium/"  class="error">Home</a><br><br>

</body>
</html>