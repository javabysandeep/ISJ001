import java.sql.*;

public class CRUDApplication {
    public static void main(String[] args) {
        // CRUD : CREATE-READ-UPDATE-DELETE
        // 1. create table
        // createTable();

        // 2. insert into the table
        // insertIntoTable();

        // 3. update the table
        //updateTable();

        // 4. delete from table
        // deleteFromTable();

        // 5. alter the table
        //alterTable();

        // 6. drop table
        //dropTable();


        // 7. select data from the table
        //readFromTable();
    }

    public static void createTable() {
        String url = "jdbc:mysql://localhost:3306/it_shaala";
        String username = "root";
        String password = "root";
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            //DDL : Data Definition Language : CREATE, DROP, ALTER, CREATE DATABASE
            String sqlQuery = "CREATE TABLE COURSE1(id int, name varchar(50), price int)";
            statement.execute(sqlQuery);

            System.out.println("Table is created");
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

    public static void dropTable() {
        String url = "jdbc:mysql://localhost:3306/it_shaala";
        String username = "root";
        String password = "root";
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            //DDL : Data Definition Language : CREATE, DROP, ALTER, CREATE DATABASE
            String sqlQuery = "drop table course1";
            statement.execute(sqlQuery);

            System.out.println("Table is dropped");
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

    public static void alterTable() {
        String url = "jdbc:mysql://localhost:3306/it_shaala";
        String username = "root";
        String password = "root";
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            //DDL : Data Definition Language : CREATE, DROP, ALTER, CREATE DATABASE
            String sqlQuery = "ALTER TABLE `it_shaala`.`course` \n" +
                    "CHANGE COLUMN `name` `course_name` VARCHAR(50) NULL DEFAULT NULL ;";
            statement.execute(sqlQuery);

            System.out.println("Table is altered");
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

    public static void insertIntoTable() {
        String url = "jdbc:mysql://localhost:3306/it_shaala";
        String username = "root";
        String password = "root";
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            //DML : Data Manipulation Language : INSERT, UPDATE, DELETE --> executeIpdate
            String sqlQuery = "insert into course values(2,'Python',3000)";
            statement.executeUpdate(sqlQuery);//DML query

            System.out.println("Data is created");
            //connection.close();
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

    public static void updateTable() {
        String url = "jdbc:mysql://localhost:3306/it_shaala";
        String username = "root";
        String password = "root";
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            //DML : Data Manipulation Language : INSERT, UPDATE, DELETE --> executeIpdate
            String sqlQuery = "update course set price=60000 where id=2";
            statement.executeUpdate(sqlQuery);//DML query

            System.out.println("Data is updated");
            //connection.close();
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

    public static void deleteFromTable() {
        String url = "jdbc:mysql://localhost:3306/it_shaala";
        String username = "root";
        String password = "root";
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            //DML : Data Manipulation Language : INSERT, UPDATE, DELETE --> executeIpdate
            String sqlQuery = "delete from course where id=1";
            statement.executeUpdate(sqlQuery);//DML query

            System.out.println("Data is deleted");
            //connection.close();
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

    public static void readFromTable() {
        String url = "jdbc:mysql://localhost:3306/it_shaala";
        String username = "root";
        String password = "root";
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            // SELECT query : executeQuery();
            String sqlQuery = "select * from course";
            ResultSet resultSet = statement.executeQuery(sqlQuery);//SELECT query

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int price = resultSet.getInt("price");
                System.out.println(id + "\t" + name + "\t" + price);
            }


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
}
