import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/login")
public class LoginController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        if ("admin".equals(username) && "admin".equals(password)) {
            HttpSession httpSession = req.getSession(true);
            httpSession.setAttribute("username", username);
            httpSession.setAttribute("password", password);
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("welcome");
            requestDispatcher.forward(req, resp);
        } else {
            resp.getWriter().println(" <h1 style=\"color: red\"> Invalid credentials </h1>");
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("index.jsp");
            requestDispatcher.include(req, resp);
        }

    }
}
