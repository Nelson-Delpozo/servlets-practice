<%

    String username = request.getParameter("uname");
    String password = request.getParameter("psw");

    if(username.equalsIgnoreCase("admin") && password.equals("password")){
        response.getWriter().println("login success");
        response.sendRedirect(request.getContextPath() + "/profile.jsp");


    }else {
        response.getWriter().println("login failed");
        response.sendRedirect(request.getContextPath() + "/index.jsp");

    }
%>


