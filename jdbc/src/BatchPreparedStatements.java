import java.sql.*;

public class BatchPreparedStatements {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // steps to connect to the db from java application

        // 1. load and register the Driver [java.sql.Driver(I)] with DriverManager
            Class.forName("com.mysql.cj.jdbc.Driver");//optional from java 7 onwards

        //2. Get connection object
        String url = "jdbc:mysql://localhost:3306/it_shaala";
        String username = "root";
        String password = "root";
        Connection connection = DriverManager.getConnection(url, username, password);

        //3. Get the Statement object
        String dynamicQuery = "insert into course values(?,?,?)";
        PreparedStatement statement = connection.prepareStatement(dynamicQuery);

        statement.executeBatch();


        System.out.println("Batch SQL queries executed");

        connection.close();


    }
}
