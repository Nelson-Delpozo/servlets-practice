<%

    String username = request.getParameter("uname");
    String password = request.getParameter("psw");

    if(username.equalsIgnoreCase("admin") && password.equals("password")){
        out.println("login success");
        response.sendRedirect(request.getContextPath() + "/profile.jsp");


    }else {
        out.println("login failed");
        response.sendRedirect(request.getContextPath() + "/index.jsp");

    }
%>


