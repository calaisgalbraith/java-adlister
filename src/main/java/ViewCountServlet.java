import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/count")
public class ViewCountServlet extends HttpServlet {
    int views = 0;

    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        //Create a page that displays a number that goes up by one every time the /count page is viewed.
        views++;
        res.getWriter().printf("Views: %d", views);

        //TODO BONUS
        //Allow the user to pass a parameter in the query string to reset the counter.
    }
}
