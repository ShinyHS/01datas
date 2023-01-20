<%-- 
    Document   : del.jsp
    Created on : Jan 18, 2023, 12:20:16 PM
    Author     : Guest01
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <style>
        label{
            font-size: 24px;
        }
    </style>
    <body>
        <h1>Hello World! delete secion</h1>
        <form action="dbdel">
            <label>enter your ID</label><br>
            <input type="number" name="delname"  required=""><br>
            <input type="submit">
        </form>
    </body>
</html>
