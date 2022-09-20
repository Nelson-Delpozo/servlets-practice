<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<%@ include file="head.jsp" %>
<body>
<%@ include file="navbar.jsp" %>
<br><br>
<%--<%@ include file="login_form.jsp" %>--%>
<section class=" text-center text-lg-start">
    <div class="card mb-3">
        <div class="row g-0 d-flex align-items-center">
            <div class="col-lg-4 d-none d-lg-flex">
                <img
                        src="https://absolutebeer.com/wp-content/uploads/2019/12/AB-Breweries-Independence-Brewing-Co-Beers-Native-Texan-Thumb.jpg"
                        alt="Texas Beers"
                        class="w-100 rounded-t-5 rounded-tr-lg-0 rounded-bl-lg-5"
                />
            </div>
            <div class="col-lg-8">
                <div class="card-body py-5 px-md-5">

                    <form action="/login" method="post">
                        <h2>Welcome!</h2>
                        <h3>please log in below</h3>
                        <br>
                        <div class="form-outline mb-4">
                            <input type="text" placeholder="Enter Username" name="username" required class="form-control"/>
                        </div>
                        <div class="form-outline mb-4">
                            <input type="password" placeholder="Enter Password" name="password" required
                                   class="form-control"/>
                        </div>
                        <!-- 2 column grid layout for inline styling -->
                        <div class="row mb-4">
                            <div class="col d-flex justify-content-center">
                                <!-- Checkbox -->
<%--                                <div class="form-check">--%>
<%--                                    <input--%>
<%--                                            class="form-check-input"--%>
<%--                                            type="checkbox"--%>
<%--                                            value=""--%>
<%--                                            id="form2Example31"--%>
<%--                                            checked--%>
<%--                                    />--%>
<%--                                    <label class="form-check-label" for="form2Example31"> Remember me </label>--%>
<%--                                </div>--%>
                            </div>

                            <div class="col">
                                <!-- Simple link -->
                                <a href="/register">Create Account</a>
                            </div>
                        </div>
                        <!-- Submit button -->
                        <button type="submit" class="btn btn-primary btn-block mb-4">Sign in</button>
                    </form>
                </div>
            </div>
        </div>
    </div>
</section>

<%@ include file="footer.jsp" %>
<%@ include file="mdnscripts.jsp" %>
</body>
</html>