<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<%@ include file="head.jsp" %>
<body>
<%@ include file="navbar.jsp" %>

<form name="login-form" action="login.jsp" method="POST">
    <label><b>Username</b></label>
    <input type="text" placeholder="Enter Username" name="uname" required>

    <label><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="psw" required>
    <button type="submit">Login</button>
</form>


<%@ include file="footer.jsp" %>
<%@ include file="mdnscripts.jsp" %>
</body>
</html>