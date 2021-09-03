import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Guess", urlPatterns = "/guess")
public class GuessServlet extends HttpServlet{


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/guessing.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       int guess = Integer.parseInt(request.getParameter("number"));

       int max = 3;
       int min = 1;
       int actual = (int) ((Math.random() * (max - min)) + min);

        System.out.println("Guess: " + guess);
        System.out.println("Actual: " + actual);

       if(guess == actual){
           response.sendRedirect("/correct");
       }
       else{
           response.sendRedirect("/incorrect");
       }

    }

}
