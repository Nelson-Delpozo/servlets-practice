<%--
  Created by IntelliJ IDEA.
  User: nelsondelpozo
  Date: 4/4/22
  Time: 2:42 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add a new quote</title>
</head>
<body>
<h2>add a quote</h2>

<form method="post">
    <label for="author">Author:</label><br>
    <input type="text" id="author" name="author"><br>
    <label for="quote">Quote:</label><br>
    <textarea id="quote" name="quote"></textarea>
    <input type="submit" value="Submit">
</form>
</body>
</html>
