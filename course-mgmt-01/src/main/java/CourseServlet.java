import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@WebServlet("/course")
public class CourseServlet extends GenericServlet {
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        String courseName = req.getParameter("courseName");
        String courseId = req.getParameter("courseId");
        String coursePrice = req.getParameter("coursePrice");

        int id = Integer.parseInt(courseId);
        int price = Integer.parseInt(coursePrice);

        //database
        String url = "jdbc:mysql://localhost:3306/it_shaala";
        String username = "root";
        String password = "root";
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url, username, password);
            String query = "insert into course values(?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, id);
            preparedStatement.setString(2, courseName);
            preparedStatement.setInt(3, price);
            preparedStatement.executeUpdate();
            connection.close();
        } catch (SQLException e) {
            System.out.println("sql exception");
        } catch (ClassNotFoundException e) {
            System.out.println("class not found exception");
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

        res.getWriter().println("Course submitted successfully.");

    }
}
