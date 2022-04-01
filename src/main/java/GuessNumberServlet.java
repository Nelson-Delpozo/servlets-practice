import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "GuessNumberServlet", value = "/GuessNumberServlet")
public class GuessNumberServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/guess.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        double answer = Math.floor(Math.random() * 3) + 1;
        String guess = request.getParameter("guess");
        double guessInt = Integer.parseInt(guess);

        response.getWriter().println(guessInt);
        response.getWriter().println(answer);

        if (guessInt > 3 || guessInt < 1) {
            response.sendRedirect("/guess.jsp");
        } else {

            if (answer == guessInt) {
                String result = "You won!";
                request.setAttribute("result", result);
                request.getRequestDispatcher("CorrectGuessServlet").forward(request, response);
            } else {
                String result = "You lost!";
                request.setAttribute("result", result);
                request.getRequestDispatcher("IncorrectGuessServlet").forward(request, response);

            }
        }
    }
}
