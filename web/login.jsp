<%-- 
    Document   : Login
    Created on : Jun 3, 2017, 2:57:12 PM
    Author     : ismayil
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.web.crud.*" %>
<%@page import="com.web.crud.Database.*" %>
<%@page import="com.web.crud.Worker.LoginYoxlayan" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            Admin a = new Admin();
            a.setUsername(request.getParameter("name"));  
            a.setPasswod(request.getParameter("password"));
            String result = LoginYoxlayan.yoxla(a);
            
            
            if (result.equals(Result.SUCCESS)) {
                response.sendRedirect("welcome.jsp");
            }
            else if (result.equals(Result.FAILURE)) {
            }
            else {
                response.sendRedirect("fb.com");
            }
        %>

    </body>
</html>
