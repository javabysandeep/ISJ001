import java.sql.*;
import java.util.Scanner;

public class StatementDemo {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/it_shaala";
        String username ="root";
        String password ="root";

        Connection connection = DriverManager.getConnection(url, username, password);
        Statement statement = connection.createStatement();

        System.out.println("Enter the student id");
        Scanner scanner = new Scanner(System.in);
        int studentId = scanner.nextInt();

        String query = "select * from student where id="+studentId+" OR 1=1";

        ResultSet resultSet = statement.executeQuery(query);

        while (resultSet.next()){
            int id = resultSet.getInt(1);
            String name = resultSet.getString(2);
            String phone = resultSet.getString(3);
            String email = resultSet.getString(4);
            String address = resultSet.getString(5);
            System.out.println(id+"\t"+name+"\t"+phone+"\t"+email+"\t"+address);
        }
        connection.close();
    }
}
