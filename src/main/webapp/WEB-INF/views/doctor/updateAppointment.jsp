<%--
  Created by IntelliJ IDEA.
  User: Максим
  Date: 09.11.2021
  Time: 22:05
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false"%>
<html>
<head>
    <title>Update appointment</title>
</head>
<body>
    <form action="update-appointment" method="POST">
        <input value="${appointment.id}" type="hidden" name = "appointmentId">
        <label>Client:
            <input type= "text" value="${appointment.record.client.fullName}" name="clientId" disabled="true"/>
        </label>
        <br>
        <label>Doctor:
            <input type="text" value="${appointment.record.doctor.fullName}" name="doctorName" disabled="true"><br />
        </label>
        <br>
        <label>Description:
            <input type="text" value="${appointment.description}" name="description"><br />
        </label>
        <button type="submit">Submit</button>
    </form>
</body>
</html>
