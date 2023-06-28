<%--
  Created by IntelliJ IDEA.
  User: sande
  Date: 27-06-2023
  Time: 10:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Table</title>
</head>
<body>
<table style="color: aqua; border-width:5px">
    <%
        for (int row = 1; row <= 10; row++) {
    %>
    <tr>
        <%
            for (int column = 1; column <= 50; column++) {
        %>
        <td>
            <%=row * column%>
        </td>
        <%}%>
    </tr>
    <%
        }
    %>
</table>


</body>
</html>
