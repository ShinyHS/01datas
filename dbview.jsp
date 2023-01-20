<%-- 
    Document   : dbview.jsp
    Created on : Jan 13, 2023, 1:15:40 PM
    Author     : Guest01
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
  
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         
        <title>JSP Page
           
        </title>
        
             </head>
    
    <style>
        div{
            display: flex;
            
        }
        input{
            margin-left: 12px; 
        }
        #hide{
            display: none;
        }
        td,th{
           font-size: 20px;
        }
        h1{
            text-align: center;
        }
        #edit{
            padding: 5px;
            margin-right: 10px; 
        }
    </style>
        
    <body>
        <h1>Hello Welcome to Database </h1>
        <div>
          <table border="1" cellspacing="2" cellpadding="6">
              <thead>
                  <tr>
                      <th>Name</th>
                  </tr>
              </thead>
              <tbody>                    
                   <c:forEach var="emp" items="${namearr}">
                  <tr>
                      <td>${emp}</td>
                  </tr>
                 </c:forEach>  
              </tbody>
          </table>
        
         <table border="1" cellspacing="2" cellpadding="6">
              <thead>
                  <tr>
                      <th>ID</th>
                  </tr>
              </thead>
              <tbody>                    
                   <c:forEach var="emp" items="${agearr}">
                  <tr>
                      <td>${emp}</td>
                  </tr>
                 </c:forEach>  
              </tbody>
         </table>
              <table border="1" cellspacing="2" cellpadding="6">
              <thead>
                  <tr>
                      <th>City</th>
                  </tr>
              </thead>
              <tbody>                    
                   <c:forEach var="emp" items="${addressarr}">
                  <tr>
                      <td>${emp}</td>
                  </tr>
                 </c:forEach>  
              </tbody>
               </table>
            
              <table border="1" cellspacing="2" cellpadding="6">
              <thead>
                  <tr>
                      <th>Salary</th>
                  </tr>
              </thead>
              <tbody>                    
                   <c:forEach var="emp" items="${salaryarr}">
                  <tr>
                      <td>${emp}</td>
                  </tr>
                 </c:forEach>  
              </tbody>
          </table>
           
             <table border="1" cellspacing="2" cellpadding="6">
              <thead>
                  <tr>
                      <th>DELETE</th>
                  </tr>
              </thead>
              <tbody>  
                    <% int i=0; %>
                   <c:forEach var="emp" items="${namearr}">    
                    <tr>
                      <td>
                          <form action="xyzz">   
                              <input type="text" value="<%= i=i+1 %>" name="xyz" id="hide">
                               <input type="submit"  name ="Delete" value="Delete">
                          </form>
                      </td>
                   </tr>
                 </c:forEach>  
              </tbody>
          </table>
                   <table border="1" cellspacing="2" cellpadding="6">
              <thead>
                  <tr>
                      <th>EDIT</th>
                  </tr>
              </thead>
              <tbody>  
                    <% int j=0; %>
                   <c:forEach var="emp" items="${namearr}">    
                    <tr>
                      <td>
                          <form action="xyzzz" id="edit">   
                              <input type="text" value="<%= j=j+1 %>" name="xyz" id="hide">
                               <input type="submit"  name ="Edit" value="Edit" > 
                          </form>
                      </td>
                   </tr>
                 </c:forEach>  
              </tbody>
          </table>
</div>
           
    </body>
</html>
