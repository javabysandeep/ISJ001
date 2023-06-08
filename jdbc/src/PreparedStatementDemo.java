import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatementDemo {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/it_shaala";
        String username = "root";
        String password = "root";

        Connection connection = DriverManager.getConnection(url, username, password);

        /*System.out.println("Enter the student id, name, email, phone, address");
        Scanner scanner = new Scanner(System.in);
        int studentId = scanner.nextInt();
        String name = scanner.next();
        String phone = scanner.next();
        String email = scanner.next();
        String address = scanner.next();*/

        String query = "insert into student values(?,?,?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1,1);
        preparedStatement.setString(2,"name");
        preparedStatement.setString(3,"phone");
        preparedStatement.setString(4,"email");
        preparedStatement.setString(5,null);

        preparedStatement.executeUpdate();
        System.out.println("Data is inserted");

        connection.close();
    }
}
