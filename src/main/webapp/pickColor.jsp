<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pick Color</title>
</head>
<body>

<h1>Pick a Color!</h1>

<form action="/pickcolor" method="POST">
    <label for="color">Enter Color:</label><br>
    <input type="text" id="color" name="color" value="">

    <br>
    <input type="submit" class="btn btn-primary btn-block" value="Submit">
</form>

</body>
</html>
