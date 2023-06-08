import java.sql.*;
import java.util.Scanner;

public class StatementDem02 {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/it_shaala";
        String username = "root";
        String password = "root";

        Connection connection = DriverManager.getConnection(url, username, password);
        Statement statement = connection.createStatement();

        System.out.println("Enter the student id, name, email, phone, address");
        Scanner scanner = new Scanner(System.in);
        int studentId = scanner.nextInt();
        String name = scanner.next();
        String phone = scanner.next();
        String email = scanner.next();
        String address = scanner.next();

        String query = "insert into student values(" + studentId + "," + "'" + name + "','" + phone + "','" + email + "','" + address + "'" + ")";
        statement.executeUpdate(query);
        connection.close();
    }
}
