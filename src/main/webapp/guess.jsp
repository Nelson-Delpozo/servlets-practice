<%--
  Created by IntelliJ IDEA.
  User: nelsondelpozo
  Date: 4/1/22
  Time: 11:09 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Guess</title>
</head>
<body>
<h2>Pick a number between 1-3: </h2>
<form action="GuessNumberServlet" method="post">
    <input type="text" id="guess" name="guess">
    <br><br>
    <input type="submit">
</form>
<br>
<h3>Your result is: ${result}</h3>
</body>
</html>
