<%-- 
    Document   : addUser
    Created on : Jun 3, 2017, 4:25:17 PM
    Author     : ismayil
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <center>
        <form action="userworker.jsp" method="post">

            <h1>****Add User****</h1>
            Name : <input type="text" name="name">
            Age : <select name="age"><option>18</option><option>19</option><option>20</option></select>
            Gender: Male<input type="radio" name="gender" value="male" > Female<input type="radio" name="gender" value="female">
            <input type="submit" value="Save" />
        </form>
    </center>

</body>
</html>
