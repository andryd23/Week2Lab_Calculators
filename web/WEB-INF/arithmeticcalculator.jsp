

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
            
            <div>
            <input type="submit" value="+" name="calculation" >
            <input type="submit" value="-" name="calculation" > 
            <input type="submit" value="*" name="calculation">          
            <input type="submit" value="%" name="calculation" >   
            </div>
            
        </form>
            <br>
        
        <div>
           ${result}
        </div>
        
         <a href="age" >Age Calculator </a>
    </body>
</html>
