import java.sql.*;

public class Demo2 {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        // Prerequisite : Loading the Driver[class provided by vendor which implements java.sql.Driver] and Registering it with the DriverManager
        Class.forName("com.mysql.jdbc.cj.Driver");

        //step 1: get the connection
        String url = "jdbc:mysql://localhost:3306/it_shaala";
        String username = "root";
        String password = "root";
        Connection connection = DriverManager.getConnection(url, username, password);

        //step 2: get the Statement to execute the queries
        Statement statement = connection.createStatement();

        //step 3: execute the queries and store the result in ResultSet object
        String sqlQuery = "select * from Student";
        ResultSet resultSet = statement.executeQuery(sqlQuery);

        //step 4: read the records from ResultSet object
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            String email = resultSet.getString("email");
            String phone = resultSet.getString("phone");
            String address = resultSet.getString("address");
            System.out.println(id + "\t" + name + "\t" + email + "\t" + phone + "\t" + address);
        }

        // step 5: close the connection
        connection.close();
    }
}
