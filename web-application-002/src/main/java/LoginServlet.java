import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

public class LoginServlet extends GenericServlet {
    public LoginServlet(){
        System.out.println("login servlet constructor");
    }
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        res.getWriter().println("Login servlet");
    }
}
