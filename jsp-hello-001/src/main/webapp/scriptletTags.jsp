<%@ page import="java.io.PrintWriter" contentType="text/html; ISO-8859-1" %>
<html>
<body>
<h2>Hello World!</h2>
<%
    System.out.println("service method part");
    /*for (int i = 0; i < 100; i++) {
        out.print(i + " ");
    }*/

    instanceMethod();
    staticMethod();
    out.println("Instance variable " + instanceVariable);
    out.println("static variable " + staticVariable);
    //request
    //out
    //page
    //pageContext
    // session
//    config

%>


<%!
    int instanceVariable = 100;
    static int staticVariable = 300;

    void instanceMethod() {
        System.out.println("instance method");
    }

    static void staticMethod() {
        System.out.println("static method");
    }
%>

<h1>Expression or statement tag</h1>
<%=100 * 300%>

<h1>Table of 1 to 30</h1>

<%

    for (int row = 1; row <= 10; row++) {
        for (int columns = 1; columns <= 30; columns++) {
            out.print(row * columns + " ");
        }
        out.println();
    }
%>


</body>
</html>
