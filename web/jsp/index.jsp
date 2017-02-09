<%@ page import="manageemployee.ManageEmployee" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>



<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add a database record or see list of records</title>
    </head>
    <body>
        
        <h3> Add a database record </h3>
        <form action="index.jsp" method="POST">
            First Name: <input type="text" name="firstName">
        <br />
            Last Name: <input type="text" name="lastName" />
            <br />
            Salary: <input type="text" name="salary" />
            <br>
        <input type="submit" value="Add database record." />
        </form>
        
        <%
String firstName = request.getParameter("firstName");
String lastName = request.getParameter("lastName");
String salary = request.getParameter("salary");

String listOfRecords = request.getParameter("listOfRecords");


if (firstName != null && lastName != null && salary != null) 
{ 
    ManageEmployee.addEmployee(firstName, lastName, salary);
%>
<br>
<b>Added record: {<%= firstName %>, <%= lastName %>, <%= salary %>}</b>
<%
}
%>

<br>
<br>
 <form action="index.jsp" method="POST">
              <input type="submit" value="List database records." name="listOfRecords">
        <br />
           
        </form>
        

        <% if(listOfRecords != null && listOfRecords.equals("List database records."))
           {
         %>
         <br>
         <h3>List of database records</h3>
         
         <%= ManageEmployee.getDatabaseRecords() %>
        <%
          }
        %>
    </body>
</html>
