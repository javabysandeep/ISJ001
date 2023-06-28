<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<body>

<h2>HTML Forms</h2>

<form action="arithmetic.jsp">
    <label for="Number1">Number 1 </label><br>
    <input type="number" id="Number1" name="number1" ><br>

    <label for="Operator">Enter Operation </label><br>
    <input type="text" id="Operator" name="operator" ><br><br>

    <label for="Number2">Number 2 </label><br>
    <input type="number" id="Number2" name="number2" ><br><br>

    <input type="submit" value="Calculate">
</form>

<p>If you click the "Submit" button, the form-data will be sent to a page called "arithmetic.jsp".</p>

</body>
</html>

