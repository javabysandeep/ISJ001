import java.sql.*;
import java.util.Scanner;

public class Metadata {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/it_shaala";
        String username = "root";
        String password = "root";

        Connection connection = DriverManager.getConnection(url, username, password);
        Statement statement = connection.createStatement();
        //ResultSet stores the actual data
        ResultSet resultSet = statement.executeQuery("select * from course");

        //ResultSetMetaData stores the information about the data stored in the resultSet object.
        ResultSetMetaData resultSetMetaData = resultSet.getMetaData();

        System.out.println("Number of columns : " + resultSetMetaData.getColumnCount());
        System.out.println("Table name: " + resultSetMetaData.getTableName(1));
        System.out.println("Schema name: " + resultSetMetaData.getSchemaName(2));

        while (resultSet.next()) {
            System.out.println(resultSetMetaData.getColumnName(1) + "\t" + resultSetMetaData.getColumnType(1));
        }

        connection.close();
    }
}
