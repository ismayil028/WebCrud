<%-- 
    Document   : Login
    Created on : Jun 3, 2017, 2:57:12 PM
    Author     : ismayil
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.web.crud.*" %>
<%@page import="com.web.crud.Database.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% 
        Admin a = new Admin();
        a.username = request.getParameter("name");
        a.password = request.getParameter("password");
        String result = LoginYoxlayan.yoxla(a);
        if(result.equals(Result.SUCCESS)){
            response.encodeRedirectURL("https://google.com");
        }
        
        %>
        
    </body>
</html>
