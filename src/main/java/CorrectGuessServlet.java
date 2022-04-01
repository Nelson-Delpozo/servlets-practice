import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "CorrectGuessServlet", value = "/CorrectGuessServlet")
public class CorrectGuessServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String result = (String)request.getAttribute("result");
        request.setAttribute("result", result);
        request.getRequestDispatcher("/guess.jsp").forward(request, response);

    }
}
