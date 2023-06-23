import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

@WebServlet("/cookie")
public class CookieController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html");

        //create cookie
        Cookie cookie1 = new Cookie("laptop","applemacbookpro");
        Cookie cookie2 = new Cookie("mobile","iphone");
        Cookie cookie3 = new Cookie("tablet","ipad");
        cookie1.setMaxAge(10000000);
        cookie2.setMaxAge(10000000);
        cookie3.setMaxAge(10000000);
        resp.addCookie(cookie1);
        resp.addCookie(cookie2);
        resp.addCookie(cookie3);
        PrintWriter writer = resp.getWriter();
        writer.print("Good morning "+ LocalDateTime.now());
    }
}
