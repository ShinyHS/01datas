<%-- 
    Document   : editpage.jsp
    Created on : Jan 18, 2023, 3:20:51 PM
    Author     : Guest01
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World! EDIT Page</h1>
          <form action="edits">
<!--            <label>enter your name</label><br>
            <input type="text" name="e1"  required=""><br>-->
<!--            <hr>-->
             <label>enter your details</label><br>
             <h3>name</h3>
            <input type="text" name="e2"  required=""> <br><br>
            <h3>city</h3>
            <input type="text" name="e3"  required=""> <br><br>
            <h3>ID</h3>
            <input type="number" name="e4" required=""> <br><br>
            <h3>salary</h3>
            <input type="text" name="e5" required=""> <br><br>
            <input type="submit">
        </form>
    </body>
</html>
