import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        if (request.getSession().getAttribute("isLoggedIn") == null || !((boolean) request.getSession().getAttribute("isLoggedIn"))) {
//            request.getRequestDispatcher("login.jsp").forward(request, response);
//        }else{
//            response.sendRedirect("/profile");
//        }
        if (request.getSession().getAttribute("user") != null) {
            response.sendRedirect("/profile");
            return;
        }
        request.getRequestDispatcher("/login.jsp").forward(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");


        // TODO: find a record in your database that matches the submitted password
        // TODO: make sure we find a user with that username
        // TODO: check the submitted password against what you have in your database


//        boolean validAttempt = false;

//        if (validAttempt) {
            // TODO: store the logged in user object in the session, instead of just the username



//            request.getSession().setAttribute("user", username);
//            response.sendRedirect("/profile");
//        } else {
//            response.sendRedirect("/login");
//        }

        if (username.equals("admin") && password.equals("password")) {
            request.getSession().setAttribute("user", username);
            request.getSession().setAttribute("isLoggedIn", true);
            response.sendRedirect("/profile");
        }else{
            response.sendRedirect("/login");
        }



    }
}