<%--
  Created by IntelliJ IDEA.
  User: Максим
  Date: 07.11.2021
  Time: 12:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Client main page</title>
</head>
<body>
<div>       <!-- content -->
    <div>    <!-- buttons holder -->
        <button onclick="location.href='makeAppointment'">To make an appointment with a doctor</button>
        <br>
        <button onclick="location.href='clientAppointments'">View my appointments</button>
        <br>
        <button onclick="location.href='clientRecords'">View my records</button>
        <br>
        <button onclick="location.href='viewDoctors'">View doctors</button>
        <br>
        <button onclick="location.href='/MvcDataSecurityTask_war_exploded/logout'">Logout</button>
    </div>
</div>
</body>
</html>
