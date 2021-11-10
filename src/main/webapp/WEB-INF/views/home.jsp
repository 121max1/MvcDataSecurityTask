<%--
  Created by IntelliJ IDEA.
  User: Максим
  Date: 14.10.2021
  Time: 13:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home page</title>
</head>
<body>
<div>
    <h1>Welcome to our hospital website</h1>
</div>
<p>Please register or login to continue</p>
<div>       <!-- content -->
    <div>    <!-- buttons holder -->
        <button onclick="location.href='register/client'">Register as client</button>
        <br>
        <button onclick="location.href='register/doctor'">Register as doctor</button>
        <br>
        <button onclick="location.href='register/administrator'">Register as admin</button>
        <br>
        <button onclick="location.href='administrator/adminMainPage'">Go to admin's page</button>
        <br>
        <button onclick="location.href='client/clientMainPage'">Go to client's page</button>
        <br>
        <button onclick="location.href='doctor/doctorMainPage'">Go to doctor's page</button>
        <br>
        <button onclick="location.href='login'">Login</button>
    </div>
</div>
</body>
</html>
