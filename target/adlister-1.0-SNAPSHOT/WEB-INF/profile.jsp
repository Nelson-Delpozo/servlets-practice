<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<%@ include file="../head.jsp" %>
<body>
<%@ include file="../navbar.jsp" %>

login successful. welcome to profile.jsp


<br><br>
<h1>Welcome To The Site!</h1>
<h2>You are logged in as: <c:out value="${user}"/>.</h2>
<br>
<form action="/logout">
<button type="submit">Logout</button>
</form>
<p>Path: <%= request.getRequestURL() %></p>
<p>User-Agent header: <%= request.getHeader("user-agent") %></p>
<br>
<%@ include file="../footer.jsp" %>
<%@ include file="../mdnscripts.jsp" %>
</body>
</html>






