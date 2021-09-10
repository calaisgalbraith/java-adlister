<%--
  Created by IntelliJ IDEA.
  User: calais
  Date: 9/9/21
  Time: 11:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Form</title>
</head>
<body>
    <form action="/register" method="post">
        <label for="username">username: </label><br>
        <input type="text" id="username" name="username"><br>
        <label for="email">Email: </label><br>
        <input type="text" id="email" name="email"><br>
        <label for="password">Password: </label><br>
        <input type="text" id="password" name="password"><br><br>
        <input type="submit" value="Submit">
    </form>

</body>
</html>
