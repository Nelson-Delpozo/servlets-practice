<%--
  Created by IntelliJ IDEA.
  User: nelsondelpozo
  Date: 4/4/22
  Time: 1:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ad-Lister</title>
</head>
<body>
hello from ad-lister show quotes page
<br>

<h1>Here are all the quotes:</h1>

<c:forEach var="quote" items="${quotes}">
    <div class="ad">
        <h2>${quote.author}</h2>
        <p>Desc: ${quote.content}</p>
    </div>
</c:forEach>
</body>
</html>
