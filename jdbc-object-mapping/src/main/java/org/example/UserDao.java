package org.example;

import java.sql.*;

public class UserDao {
    void addUser(User user) {
        String url = "jdbc:mysql://localhost:3306/cashbook";
        String username = "root";
        String password = "root";
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
             connection = DriverManager.getConnection(url, username, password);
            String query = "insert INTO user(username, password, name, email, phone) values(?,?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1,user.getUsername());
            preparedStatement.setString(2,user.getPassword());
            preparedStatement.setString(3,user.getName());
            preparedStatement.setString(4,user.getEmail());
            preparedStatement.setString(5,user.getPhone());
            preparedStatement.executeUpdate();
            System.out.println("User added successfully");
        } catch (ClassNotFoundException e) {
            System.out.println("Unable to load the driver class");
        } catch (SQLException e) {
            System.out.println("Failed to get connection " + e.getMessage());
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                System.out.println("unable to close the connection "+e.getMessage());
            }
        }
    }

    public User getUser(int userId) {
        User user = new User();
        String url = "jdbc:mysql://localhost:3306/cashbook";
        String username = "root";
        String password = "root";
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from user where user_id=" + userId);

            while (resultSet.next()){
                user.setUserId(resultSet.getInt(1));
                user.setUsername(resultSet.getString(2));
                user.setPassword(resultSet.getString(3));
                user.setName(resultSet.getString(4));
                user.setEmail(resultSet.getString(5));
                user.setPhone(resultSet.getString(6));
            }

        } catch (ClassNotFoundException e) {
            System.out.println("Unable to load the driver class");
        } catch (SQLException e) {
            System.out.println("Failed to get connection " + e.getMessage());
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                System.out.println("unable to close the connection "+e.getMessage());
            }
        }
        return user;
    }
}
