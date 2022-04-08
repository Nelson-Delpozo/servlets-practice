import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "RegisterServlet", value = "/register")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/register.jsp")
                .forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User user = new User(

                request.getParameter("username"),
                request.getParameter("email"),
                request.getParameter("password")
        );
        try {
            DaoFactory.getUsersDao().insert(user);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        response.sendRedirect("/login");
    }

    }

