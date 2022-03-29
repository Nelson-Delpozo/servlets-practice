
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//@WebServlet(name = "HelloWorldServlet", urlPatterns = "/")
//public class HelloWorldServlet extends HttpServlet {
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws NullPointerException, IOException {
//           String name = request.getParameter("name");
//           response.getWriter().printf("<h1>Hello, %s</h1>%n", name);
//    }
//}

@WebServlet(name = "TestServlet", urlPatterns = "/")
public class TestServlet extends HttpServlet {
    int count = 0;
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String name = request.getParameter("name");
        if(name == null){
            response.getWriter().printf("<h1>Hello from TestServlet");
            response.getWriter().printf("<h2>page counter:  %s</h2>%n", count);
        }else {
            response.getWriter().printf("<h1>Hello, %s</h1>%n", name);
            response.getWriter().printf("<h2>page visit counter:  %s</h2>%n", count);

        }
        count += 1;
    }
}






