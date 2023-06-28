<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<body>

<h2>HTML Forms</h2>

<form action="request.jsp">
    <label for="fname">First name:</label><br>
    <input type="text" id="fname" name="fname" ><br>
    <label for="lname">Last name:</label><br>
    <input type="text" id="lname" name="lname" ><br><br>
    <input type="submit" value="Submit">
</form>

<p>If you click the "Submit" button, the form-data will be sent to a page called "request.jsp".</p>

</body>
</html>

