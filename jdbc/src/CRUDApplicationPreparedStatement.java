import java.sql.*;
import java.util.Scanner;

public class CRUDApplicationPreparedStatement {
    public static void main(String[] args) throws SQLException {
        //insertIntoTable();
        selectFromTable();
    }


    public static void insertIntoTable() {
        String url = "jdbc:mysql://localhost:3306/it_shaala";
        String username = "root";
        String password = "root";
        Connection connection = null;
        try {
            System.out.println("Enter the course id, name, price");
            Scanner scanner = new Scanner(System.in);
            int courseId = scanner.nextInt();
            String courseName = scanner.next();
            int coursePrice = scanner.nextInt();


            connection = DriverManager.getConnection(url, username, password);
            String sqlQuery = "INSERT INTO COURSE values(?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);

            preparedStatement.setInt(1,courseId);
            preparedStatement.setString(2, courseName);
            preparedStatement.setInt(3,coursePrice);

            preparedStatement.executeUpdate();
            System.out.println("Data is created");
        } catch (SQLException e) {
            System.out.println("exception occurred while connecting " + e.getMessage());
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                System.out.println("Issue in closing the connection " + e.getMessage());
            }
        }
    }
    public static void selectFromTable() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/it_shaala";
        String username ="root";
        String password ="root";

        Connection connection = DriverManager.getConnection(url, username, password);
        String query = "select * from student where id=?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);

        System.out.println("Enter the student id");
        Scanner scanner = new Scanner(System.in);
        int studentId = scanner.nextInt();

        preparedStatement.setInt(1,studentId);

        ResultSet resultSet = preparedStatement.executeQuery();

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
