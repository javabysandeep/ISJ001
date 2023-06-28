<%--
  Created by IntelliJ IDEA.
  User: sande
  Date: 27-06-2023
  Time: 09:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ServletContext and ServletConfig for JSP page</title>
</head>
<body>
<%
    String username = application.getInitParameter("username");
    String password = application.getInitParameter("password");

    out.println("Servlet Context username:" + "\t" + username);
    out.println("Servlet Context password:" + "\t" + password);
%>
</body>
</html>
