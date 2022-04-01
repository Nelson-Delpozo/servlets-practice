import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.Arrays;

@WebServlet(name = "PizzaServlet", value = "/PizzaServlet")
public class PizzaServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String car = request.getParameter("crust");
        response.getWriter().println(car);

        String sauce = request.getParameter("sauce");
        response.getWriter().println(sauce);

        String size = request.getParameter("size");
        response.getWriter().println(size);

        String[] toppings = request.getParameterValues("toppings");
        response.getWriter().println(Arrays.toString(toppings));

        String address = request.getParameter("address");
        response.getWriter().println(address);

    }
}
