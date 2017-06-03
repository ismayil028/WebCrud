<%-- 
    Document   : userworker
    Created on : Jun 3, 2017, 6:58:46 PM
    Author     : ismayil
--%>

<%@page import="com.web.crud.Result"%>
<%@page import="com.web.crud.Worker.UserWorker"%>
<%@page import="com.web.crud.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            User u = new User();
            u.setName(request.getParameter("name"));
            u.setAge(Integer.parseInt(request.getParameter("age")));
            u.setGender(request.getParameter("gender"));
            String result = UserWorker.addUser(u);
            if(result.equals(Result.ACCESS)){
            response.sendRedirect("addUser.jsp");
            }else if (result.equals(Result.PROBLEM)){
            response.sendRedirect("https://google.com");
            }else {
            response.sendRedirect("index.jsp");
            }
            
        %>
    </body>
</html>
