<%@ page import="com.itshaala.model.Course" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Course Listing</title>
</head>
<body>
<table style="border-width: 10px">
    <tr>
        <th>Course ID</th>
        <th>Course Name</th>
        <th>Course Price</th>
        <th>Course Description</th>
    </tr>
    <%
        List<Course> courseList = (List<Course>) request.getAttribute("courses");
        for (Course course : courseList) {

    %>
    <tr>
        <td><%=course.getCourseId()%>
        </td>
        <td><%=course.getCourseName()%>
        </td>
        <td><%=course.getCoursePrice()%>
        </td>
        <td><%=course.getCourseDescription()%>
        </td>
    </tr>

    <%

        }
    %>
</table>
</body>
</html>
