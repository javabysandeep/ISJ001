import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
import java.io.PrintWriter;

@WebFilter(urlPatterns ={"/*"} )
public class SecurityFilter implements Filter {
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        PrintWriter writer = response.getWriter();
        writer.println("Security Filter Request");

        chain.doFilter(request, response);

        writer.println("Security response check");

    }

    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("filter init method");
    }

    public void destroy() {
        System.out.println("filter destroy method");
    }
}
