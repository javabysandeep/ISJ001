import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

@WebServlet("/greet")
public class GreetingServlet extends GenericServlet {

    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        System.out.println("service method: writing on console");

        PrintWriter writer = response.getWriter();
        writer.println("Good morning "+ LocalDateTime.now());
    }
}
