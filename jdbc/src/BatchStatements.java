import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchStatements {
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
        Statement statement = connection.createStatement();

        String query1 = "insert into course values(11,'Fullstack Java with React', 300)";
        String query2 = "insert into course values(12,'MEAN Stack', 300)";
        String query3 = "insert into course values(13,'MERN', 300)";
        String query4 = "insert into course values(14,'Fullstack .NET', 300)";
        String query5 = "insert into course values(15,'Fullstack  PHP', 300)";

        statement.addBatch(query1);
        statement.addBatch(query2);
        statement.addBatch(query3);
        statement.addBatch(query4);
        statement.addBatch(query5);

        statement.executeBatch();
        System.out.println("Batch SQL queries executed");

        connection.close();


    }
}
