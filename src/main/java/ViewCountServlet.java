import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//Create a page that displays a number that goes up by one every time the /count page is viewed.
@WebServlet(name = "ViewCountServlet", urlPatterns = "/count")
public class ViewCountServlet extends HttpServlet {
    int views = 0;

    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        //Allow the user to pass a parameter in the query string to reset the counter.
        String reset = req.getParameter("reset");
        if(reset == null){
            views++;
        }
        else if(reset.equals("reset")){
            views = 0;
            views++;
        }

        out.printf("Views: %d\n", views);
        out.println("To reset counter: /count?reset=reset");

    }
}
