import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "QuotesServlet", urlPatterns = "/quotes")
public class QuotesServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.getRequestDispatcher("quotes.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // Use the factory to get the dao object
        Quotes quotesDao = QuotesDaoFactory.getQuotesDao();
        // Use a method on the dao to get all the products
        List<Quote> quotes = quotesDao.all();
        // Pass the data to the jsp
        request.setAttribute("quotes", quotes);
        request.getRequestDispatcher("/quotes.jsp").forward(request, response);

    }
}
