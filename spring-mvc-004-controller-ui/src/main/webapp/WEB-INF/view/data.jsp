<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Data flow from controller to view</title>
</head>
<body>
<h1> Reading data from ModelAndView Object inside the view page.</h1>
<%
    String greeting = (String) request.getAttribute("greeting");
    out.println("Greetings of the day : " + greeting);
%>
<hr/>
Greetings of the day : ${greeting}

<hr/>
<h1>Reading Object from Controller- MAV</h1>
Morning Greeting : ${greetingObject.morningGreeting}
Afternoon Greeting : ${greetingObject.afternoonGreeting}
Evening Greeting : ${greetingObject.eveningGreeting}
Night Greeting : ${greetingObject.nightGreeting}

</body>
</html>
