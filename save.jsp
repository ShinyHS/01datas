<%-- 
    Document   : save.jsp
    Created on : Jan 11, 2023, 1:05:55 PM
    Author     : Guest01
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
        <style>
            table,td,tr{
                padding: 15px;
                border: 1px solid black;
                border-collapse: collapse;
            }
        </style>
    <body>
        <h1>Hello World!</h1>
        
        <table>
            <tr>
                <td>name</td>
                <td>city</td>
                <td>age</td><!-- comment -->
                <td>salary</td>
            </tr>
             <tr>
                <td> <%= request.getAttribute("result") %></td>
                <td><%= request.getAttribute("city") %></td>
                <td><%= request.getAttribute("age") %></td>
                <td><%= request.getAttribute("salary") %></td>
             </tr>
            
             <h3>  <a href="view">view to database</a></h3>
            
        </table>
    </body>
</html>
