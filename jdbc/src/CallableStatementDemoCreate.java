import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CallableStatementDemoCreate {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //1. load and register the Driver with the DriverManager
        Class.forName("com.mysql.cj.jdbc.Driver");

        //2. get connection from DriverManager
        String url = "jdbc:mysql://localhost:3306/it_shaala";
        String username = "root";
        String password = "root";
        Connection connection = DriverManager.getConnection(url, username, password);

        //3. Get the Statement object
        String query ="CREATE DEFINER=`root`@`localhost` PROCEDURE `bulk_insert`()\n" +
                "BEGIN\n" +
                "\n" +
                "insert into course values(101,'Python Core',50);\n" +
                "insert into course values(102,'Python Advance',50);\n" +
                "insert into course values(103,'Python Framework',50);\n" +
                "insert into course values(104,'Python with DSA',50);\n" +
                "insert into course values(105,'Python with IDE',50);\n" +
                "insert into course values(106,'Python Django',50);\n" +
                "\n" +
                "END";
        CallableStatement callableStatement = connection.prepareCall(query);

        //4. execute the query
        callableStatement.execute();

        //5. close the connection
        connection.close();
        System.out.println("Stored procedure created");
    }
}
