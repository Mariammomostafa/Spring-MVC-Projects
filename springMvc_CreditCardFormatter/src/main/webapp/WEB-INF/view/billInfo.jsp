<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

Amount : ${billDto.amount}  <br><br>

Currency : ${billDto.currency} *** (${billDto.currency.displayName}) <br><br>


Date : ${billDto.date}  <br><br>


CreditCard : ${billDto.creditCard.firstFourDigit}-${billDto.creditCard.secondFourDigit}-${billDto.creditCard.thirdFourDigit}-${billDto.creditCard.lastFourDigit} <br><br>


</body>
</html>