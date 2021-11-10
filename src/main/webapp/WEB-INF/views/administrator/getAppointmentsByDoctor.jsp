<%--
  Created by IntelliJ IDEA.
  User: Максим
  Date: 08.11.2021
  Time: 1:01
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false"%>
<html>
<head>
    <title>Appointments</title>
    <style>
        table {
            font-family: arial, sans-serif;
            border-collapse: collapse;
            width: 100%;
        }

        td, th {
            border: 1px solid #dddddd;
            text-align: left;
            padding: 8px;
        }

        tr:nth-child(even) {
            background-color: #dddddd;
        }
    </style>
</head>
<body>
<table>
    <tr>
        <th>Client's full name</th>
        <th>Date and time</th>
        <th>Description</th>
    </tr>
    <c:forEach var="appointment" items="${appointments}">
        <tr>
            <td>${appointment.record.client.fullName}</td>
            <td>${appointment.record.recordDateTime}</td>
            <td>${appointment.description}</td>
        </tr>
    </c:forEach>
</table>
<button onclick="location.href='/MvcDataSecurityTask_war_exploded/administrator/doctors'">back</button>

</body>
