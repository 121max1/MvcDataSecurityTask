<%--
  Created by IntelliJ IDEA.
  User: Максим
  Date: 09.11.2021
  Time: 20:57
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
        <th>Update</th>
    </tr>
    <c:forEach var="appointment" items="${appointments}">
        <tr>
            <td>${appointment.record.client.fullName}</td>
            <td>${appointment.record.recordDateTime}</td>
            <td>${appointment.description}</td>
            <td><button onclick="location.href='viewAppointments/update/${appointment.id}'">Update</button></td>
        </tr>
    </c:forEach>
</table>
<button onclick="location.href='doctorMainPage'">back</button>

</body>
