import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;


@WebServlet(value = "/today", loadOnStartup = 1)
public class TodayDate implements Servlet {
    public TodayDate() {
        System.out.println("TodayDat constructor");
    }

    public void init(ServletConfig config) throws ServletException {
        System.out.println("init method of TodayDate class");
    }

    public ServletConfig getServletConfig() {
        return null;
    }

    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.printf("service method of Today Date");
    }

    public String getServletInfo() {
        return null;
    }

    public void destroy() {
        System.out.println("destroy method of todayDate class");
    }
}
