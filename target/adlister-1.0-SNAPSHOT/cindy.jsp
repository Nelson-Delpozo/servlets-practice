<%--
  Created by IntelliJ IDEA.
  User: nelsondelpozo
  Date: 4/2/22
  Time: 11:45 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Cindy</title>
</head>
<body>
<form action="CindyServlet" method="post">
    <h3>how is Cindy feeling today?:</h3>
    <select name="feelings">
        <option value="great">Feelin' Great</option>
        <option value="pretty">Feelin' Pretty</option>
        <option value="meh">Feelin' kinda meh</option>
    </select>
    <input type="submit">
</form>

<h1>${message}</h1>
</body>
</html>
