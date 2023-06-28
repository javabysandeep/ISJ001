<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Read request details</title>
</head>
<body>
<h2>Reading user input from request</h2>
<%
    String fname = request.getParameter("fname");
    String lname = request.getParameter("lname");
    out.println("you have entered ");
    out.println("First name " + fname);
    out.println("Last name " + lname);
%>

</body>
</html>

