<%--
  Created by IntelliJ IDEA.
  User: nelsondelpozo
  Date: 3/31/22
  Time: 10:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Pizza Order</title>
</head>
<body>
<form action="PizzaServlet" method="post">
  <h3>Choose a crust:</h3>
  <select name="crust" id="crust">
    <option value="thin">Thin</option>
    <option value="hand-tossed">Hand-Tossed</option>
    <option value="deep-dish">Deep Dish</option>
  </select>

  <br><br>

  <h3>Choose a sauce:</h3>
  <select name="sauce" id="sauce">
    <option value="red">Red</option>
    <option value="white">White</option>
    <option value="pesto">Pesto</option>
  </select>

  <br><br>

  <h3>Choose a size:</h3>
  <input type="radio" id="small" name="size" value="small">
  <label for="small">Small</label><br>
  <input type="radio" id="medium" name="size" value="medium">
  <label for="medium">Medium</label><br>
  <input type="radio" id="large" name="size" value="large">
  <label for="large">Large</label>

  <br><br>

  <h3>Choose your toppings:</h3>
  <input type="checkbox" id="mushrooms" name="toppings" value="mushrooms">
  <label for="mushrooms"> Mushrooms</label><br>
  <input type="checkbox" id="pineapple" name="toppings" value="pineapple">
  <label for="pineapple"> Pineapple</label><br>
  <input type="checkbox" id="jalapenos" name="toppings" value="jalapenos">
  <label for="jalapenos"> Jalapenos</label>
  <br><br>

  <h3>Enter your address:</h3>

  <textarea id="address" name="address" rows="4" cols="50"></textarea>

  <br><br>
  <input type="submit" value="Submit">
</form>

</body>
</html>

