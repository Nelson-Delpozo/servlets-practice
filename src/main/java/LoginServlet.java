import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (request.getSession().getAttribute("isLoggedIn") == null || !((boolean) request.getSession().getAttribute("isLoggedIn"))) {
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }else{
            response.sendRedirect("/profile");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if (username.equals("admin") && password.equals("password")) {
            request.getSession().setAttribute("user", username);
            request.getSession().setAttribute("isLoggedIn", true);
            response.sendRedirect("/profile.jsp");
        }else{
            response.sendRedirect("/login");
        }
//        request.getRequestDispatcher("LoginServlet").forward(request, response);
    }
}