import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(urlPatterns = "/hello")
public class HelloWorldServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {

        //DONE Create a page that displays "Hello World!" when a user visits /hello
        res.getWriter().println("Hello World!");

        //TODO BONUS
        //Make the page say "Hello, <name>!" if name is passed as part of the query string
        // (e.g. /hello?name=codeup), otherwise default to "Hello, World!".

    }
}

