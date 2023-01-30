<%-- 
    Document   : ageCalculator.jsp
    Created on : 29-Jan-2023, 3:52:11 AM
    Author     : Rahul Bisht
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1><mark><u>AGE CALCULATOR</u></mark></h1>
        
        <form action="age" method="POST">
            Enter Your Age: 
            <input type="text" name="age"><br>
            <input type="submit" value="Age Next Birthday">
        </form>
        
        <p>${displayMessage}</p>
        <a href="arithmetic">Arithmetic Calculator</a>
    </body>
    
    </html>
