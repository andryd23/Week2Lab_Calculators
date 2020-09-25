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
        <form method="Post" >
        Enter your age:<input type="text" name="user_age"><br>
        <input type="submit" value="Age next birthday">
        </form>
        
        <div>
            ${message}
        </div>
        
    </body>
</html>
