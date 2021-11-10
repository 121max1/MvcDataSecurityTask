<%--
  Created by IntelliJ IDEA.
  User: Максим
  Date: 07.11.2021
  Time: 12:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Admin Page</title>
</head>
<body>
<div>       <!-- content -->
    <div>    <!-- buttons holder -->
        <button onclick="location.href='clients'">Get clients</button>
        <br>
        <button onclick="location.href='doctors'">Get doctors</button>
        <br>
        <button onclick="location.href='getAppointmentsByDoctor'">Get appointments by doctor</button>
        <br>
        <button onclick="location.href='getAppointmentsByClient'">Get appointments by client</button>
        <br>
        <button onclick="location.href='/MvcDataSecurityTask_war_exploded/logout'">Logout</button>
    </div>
</div>
</body>
</html>
