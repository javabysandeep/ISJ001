import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        //read the input
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        if("admin".equals(username) && "admin".equals(password)){
            //forward to the welcome page
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("welcome");
            requestDispatcher.forward(req,resp);

        } else {
            //forward to login page
            resp.getWriter().print("<h2 style=\"color: red\">Invalid Credentials. Try login once again </h2>");
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("index.jsp");
            requestDispatcher.include(req,resp);
        }
    }
}
