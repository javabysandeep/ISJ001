package util;

import model.Student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBUtils {
    public static Connection connection = null;
   public static PreparedStatement preparedStatement = null;
    public static Connection getConnection() {

        String url = "jdbc:mysql://localhost:3306/student_management_system";
        String username = "root";
        String password = "root";

        try {
            connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            System.out.println("issue while getting connection to the database " + e.getMessage());
        }

        return connection;
    }
    public static PreparedStatement getPreparedStatement(String query){
        try {
           preparedStatement = connection.prepareStatement(query);
        } catch (SQLException e) {
            System.out.println();
        }
        return preparedStatement;
    }
}
