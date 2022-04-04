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
hello from ad-lister show ads page
<br>
<form method="post">
  <input type="submit" value="See All Ads">
</form>

<h1>Here are all the ads:</h1>

<c:forEach var="ad" items="${ads}">
  <div class="ad">
    <h2>${ad.title}</h2>
    <p>Desc: ${ad.description}</p>
  </div>
</c:forEach>
</body>
</html>
