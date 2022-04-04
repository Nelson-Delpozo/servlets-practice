import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "PickColorServlet", value = "/pickcolor")
public class PickColorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/pickcolor.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String color = request.getParameter("bg_color");
        request.setAttribute("bg_color", color);
        request.getRequestDispatcher("ChangeBgColorServlet").forward(request, response);

    }
}
