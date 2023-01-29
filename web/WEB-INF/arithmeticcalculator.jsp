<%-- 
    Document   : arithmeticcalculator.jsp
    Created on : 29-Jan-2023, 4:06:48 AM
    Author     : Rahul Bisht
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
         <form action="arithemetic" method="post">
            First Number: <input type="text" name="first" value="${first}"<br>
            Second Number: <input type="text" name="second" value="${second}"><br>
            <input type="submit" value="+" name="operator">
            <input type="submit" value="-" name="operator">
            <input type="submit" value="*" name="operator">
            <input type="submit" value="%" name="operator">
        </form>
            
        <p>${result}</p>
        <a href = "age">Age Calculator</a>
    </body>
</html>
