import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/logout")
public class LogoutController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        HttpSession httpSession = req.getSession(false);
        httpSession.invalidate();
        resp.getWriter().println(" <h1 style=\"color: green\"> Successfully Logout </h1>");
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("index.jsp");
        requestDispatcher.include(req, resp);
    }
}
