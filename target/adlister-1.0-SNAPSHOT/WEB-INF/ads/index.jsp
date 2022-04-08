<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<%@ include file="/head.jsp" %>

<body>
<%@ include file="/navbar.jsp" %>
<br><br>

<h1>Here are all the ads:</h1>

<c:forEach var="ad" items="${ads}">
  <div class="ad">
    <h2>${ad.title}</h2>
    <p>Desc: ${ad.description}</p>
  </div>
</c:forEach>

<%@ include file="/footer.jsp" %>
<%@ include file="/mdnscripts.jsp" %>
</body>
</html>
