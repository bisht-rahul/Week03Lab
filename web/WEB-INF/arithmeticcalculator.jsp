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
        <h1><mark><u>Arithmetic Calculator</u></mark></h1>
        
         <form action="arithmetic" method="POST">
            First Number: <input type="text" name="first" value="${first}"><br>
            Second Number: <input type="text" name="second" value="${second}"><br>
            <input type="submit" value="+" name="operator">
            <input type="submit" value="-" name="operator">
            <input type="submit" value="*" name="operator">
            <input type="submit" value="%" name="operator">
        </form>
            
        <p>${displayMessage}</p>
        <a href = "age"><h>AGE CALCULATOR</h></a>
    </body>
</html>
