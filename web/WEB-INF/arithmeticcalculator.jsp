

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator </h1><br>
        
        <form method="post">
            First: <input type="text" name="firstN" value="${numberOne}">
            Second: <input type="text" name="secondN" value="${numberTwo}">
            <input type="submit" value="+" > <input type="button" value="-" > <input type="button" value="*"><input type="button" value="%">    
        </form>
        
        <div>
            <p>Result: </p> ${message}
        </div>
        
         <a href="/WEB-INF/agecalculator.jsp" >Age Calculator </a>
    </body>
</html>
