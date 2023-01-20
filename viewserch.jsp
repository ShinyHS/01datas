<%-- 
    Document   : viewserch.jsp
    Created on : Jan 19, 2023, 10:22:49 AM
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
        table,thead,tr,th,tbody,td{
            padding: 10px;
            border-collapse: collapse;
        }
    </style>
    <body>
        <h1>Hello World!</h1>
           <table border="1" width="" cellspacing="" >
               <thead>
                   <tr>
                       <th>Name</th>
                       <th>City</th>
                       <th>ID</th>
                       <th>Salary</th>
                   </tr>
               </thead>
               <tbody>
                   <tr>
                       <td>${s1}</td>
                       <td>${s3}</td>
                       <td>${s2}</td>
                       <td>${s4}</td>
                   </tr>
               </tbody>
           </table>

    </body>
</html>
