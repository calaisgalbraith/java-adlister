<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Guessing</title>
</head>
<body>

<h1>Guess a Number Between 1 and 3</h1>

<form action="/guess" method="POST">
    <input type="radio" id="1" name="number" value="1">
    <label for="1">1</label><br>
    <input type="radio" id="2" name="number" value="2">
    <label for="2">2</label><br>
    <input type="radio" id="3" name="number" value="3">
    <label for="3">3</label><br>
    <input type="submit" class="btn btn-primary btn-block" value="Submit">
</form>

</body>
</html>
