
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<%@ include file="head.jsp" %>
<body>
<%@ include file="navbar.jsp" %>

login successful. welcome to profile.jsp
<br><br>
<h1>Welcome To The Site!</h1>
<p>Path: <%= request.getRequestURL() %></p>
<p>User-Agent header: <%= request.getHeader("user-agent") %></p>
<br>
<%@ include file="footer.jsp" %>
<%@ include file="mdnscripts.jsp" %>
</body>
</html>






