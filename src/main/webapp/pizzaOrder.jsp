<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pizza Order</title>
</head>
<body>

<h1>Order a Pizza!</h1>

<form action="/pizza-order" method="POST">
    <p>Select Crust Type:</p>
    <input type="radio" id="regular" name="crust" value="regular">
    <label for="regular">Regular</label><br>
    <input type="radio" id="thin" name="crust" value="thin">
    <label for="thin">Thin</label><br>
    <input type="radio" id="deep" name="crust" value="deep">
    <label for="deep">Deep-Dish</label><br>

    <br>

    <p>Select Sauce Type:</p>
    <input type="radio" id="marinara" name="sauce" value="marinara">
    <label for="marinara">Marinara</label><br>
    <input type="radio" id="white" name="sauce" value="white">
    <label for="white">White</label><br>
    <input type="radio" id="none" name="sauce" value="none">
    <label for="deep">None</label><br>

    <br>

    <label for="size">Select Size:</label>
    <select name="size" id="size">
        <option value="">--Select a Size--</option>
        <option id="small" name="size" value="small">Small</option>
        <option id="medium" name="size" value="medium">Medium</option>
        <option id="large" name="size" value="large">Large</option>
    </select>

    <br>

    <p>Select Toppings:</p>
    <input type="checkbox" id="onions" name="toppings" value="onion">
    <label for="onions">Onions</label><br>
    <input type="checkbox" id="pineapple" name="toppings" value="pineapple">
    <label for="pineapple">Pineapple</label><br>
    <input type="checkbox" id="ham" name="toppings" value="ham">
    <label for="ham">Ham</label><br>

    <label for="address">Enter Address:</label><br>
    <input type="text" id="address" name="address" value="">

    <br>
    <input type="submit" class="btn btn-primary btn-block" value="Submit Order">
</form>


</body>
</html>
