import java.sql.*;

public class Demo1 {
    public static void main(String[] args) throws SQLException {
        //1. Get the connection
        String url = "jdbc:mysql://localhost:3306/it_shaala";
        String username = "root";
        String password = "root";

        Connection connection = DriverManager.getConnection(url, username, password);

        //2. execute the query
        String sqlQuery = "SELECT * FROM Student";

        Statement statement = connection.createStatement();

        ResultSet resultSet = statement.executeQuery(sqlQuery);

        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            String phone = resultSet.getString("Phone");
            String email = resultSet.getString("email");
            String address = resultSet.getString("address");
            System.out.println(id + "\t" + name + "\t" + phone + "\t" + email + "\t" + address);
        }

        connection.close();

    }

}
