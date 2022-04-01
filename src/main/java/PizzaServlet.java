import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.Arrays;

@WebServlet(name = "PizzaServlet", value = "/PizzaServlet")
public class PizzaServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/pizza-order-form.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String crust = request.getParameter("crust");
//        response.getWriter().println(crust);
        String sauce = request.getParameter("sauce");
//        response.getWriter().println(sauce);
        String size = request.getParameter("size");
//        response.getWriter().println(size);
        String[] toppings = request.getParameterValues("toppings");
//        response.getWriter().println(Arrays.toString(toppings));
        String address = request.getParameter("address");
//        response.getWriter().println(address);

        request.setAttribute("crust", crust);
        request.setAttribute("sauce", sauce);
        request.setAttribute("size", size);
        request.setAttribute("toppings", Arrays.toString(toppings));
        request.setAttribute("address", address);
        request.getRequestDispatcher("/pizza-order-form.jsp").forward(request, response);

    }
}
