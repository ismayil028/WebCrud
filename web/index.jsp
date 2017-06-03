<%-- 
    Document   : index
    Created on : Jun 3, 2017, 12:31:51 PM
    Author     : ismayil
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body><form action="login.jsp" method="post">
            <center>
                <h1>Simple CRUD Web Application</h1>
                Username: <input type="text" name="name" required="true"><br>
                Password: <input type="text" name="password" required="true"><br>
                <input type="submit" value="Login" /> &nbsp;&nbsp;<input type="submit" value="Reset">
            </center>
        </form>
    </body>
</html>
