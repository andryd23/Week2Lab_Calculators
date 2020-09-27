<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <br>
        <form method="Post" action="age" >
         Enter your age:<input type="number" name="user_age" value="${ageUser}"><br>
        <input type="submit" value="Age next birthday">
        </form>
        
        <div>
            ${message}
        </div>
        <a href="arithmetic" >Arithmetic Calculator </a>
        
    </body>
</html>
