import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

public class FirstServlet implements Servlet {
    ServletConfig servletConfig;

    public void init(ServletConfig config) throws ServletException {
        this.servletConfig = config;
        String username = config.getInitParameter("username");
        String password = config.getInitParameter("password");
        System.out.println("ServletConfig object details : username " + username);
        System.out.println("ServletConfig object details : password " + password);
    }

    public ServletConfig getServletConfig() {
        return servletConfig;
    }

    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        String username = getServletConfig().getInitParameter("username");
        String password = getServletConfig().getInitParameter("password");
        res.getWriter().println("Servlet config object details : " + username + "\t" + password);


        ServletContext servletContext = getServletConfig().getServletContext();
        String usernameContext = servletContext.getInitParameter("username");
        String passwordContext = servletContext.getInitParameter("password");
        res.getWriter().println("Servlet Context object details : " + usernameContext + "\t" + passwordContext);

    }

    public String getServletInfo() {
        return null;
    }

    public void destroy() {

    }
}
