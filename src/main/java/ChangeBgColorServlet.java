import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ChangeBgColorServlet", value = "/ChangeBgColorServlet")
public class ChangeBgColorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String newBG = (String)request.getAttribute("bg_color");
        request.setAttribute("newBG", newBG);
        request.getRequestDispatcher("/viewcolor.jsp").forward(request, response);
//        response.getWriter().println(color);
    }
}
