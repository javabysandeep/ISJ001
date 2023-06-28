<%@ page import="java.util.InputMismatchException" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page errorPage="error.jsp" %>
<html>
<head>
    <title>Read request details</title>
</head>
<body>
<h2>Calculator App</h2>
<%

    int number1 = Integer.parseInt(request.getParameter("number1"));
    int number2 = Integer.parseInt(request.getParameter("number2"));
    String operator = request.getParameter("operator");
    switch (operator) {
        case "+":
            out.println(number1 + number2);
            break;
        case "-":
            out.println(number1 - number2);
            break;
        case "*":
            out.println(number1 * number2);
            break;
        case "/":
            out.println(number1 / number2);
            break;
        case "%":
            out.println(number1 % number2);
            break;
        default:
            out.println("Invalid operator");
            break;
    }

%>

</body>
</html>

