import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//DONE Create a page that displays "Hello World!" when a user visits /hello
//Make the page say "Hello, <name>!" if name is passed as part of the query string
// (e.g. /hello?name=codeup), otherwise default to "Hello, World!".

@WebServlet(name = "HelloWorldServlet", urlPatterns = "/hello")
public class HelloWorldServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        String name = req.getParameter("name");

        if ((name == null)) {
            out.println("Hello World!");
        } else {
            out.printf("Hello %s!", name);
        }

    }
}

