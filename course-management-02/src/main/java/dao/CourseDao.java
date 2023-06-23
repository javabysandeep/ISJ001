package dao;

import model.Course;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CourseDao {
    public void addCourse(Course course) {
        //2. write this in the database
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/it_shaala";
            String username = "root";
            String password = "root";
            connection = DriverManager.getConnection(url, username, password);
            String query = "insert into course values (?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, course.getCourseId());
            preparedStatement.setString(2, course.getCourseName());
            preparedStatement.setInt(3, course.getCoursePrice());
            preparedStatement.executeUpdate();


        } catch (ClassNotFoundException classNotFoundException) {
            System.out.println("class not found");
        } catch (SQLException sqlException) {
            System.out.println(sqlException.getMessage());
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                System.out.println("issue in closing the connection");
            }
        }
    }

    public List<Course> getAllCourses() {
        List<Course> courseList = new ArrayList<Course>();

        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/it_shaala";
            String username = "root";
            String password = "root";
            connection = DriverManager.getConnection(url, username, password);
            String query = "select * from course";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                int price = resultSet.getInt("price");
                String name = resultSet.getString("course_name");
                Course course = new Course(id, name, price);
                courseList.add(course);

            }

        } catch (ClassNotFoundException classNotFoundException) {
            System.out.println("class not found");
        } catch (SQLException sqlException) {
            System.out.println(sqlException.getMessage());
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                System.out.println("issue in closing the connection");
            }
        }
        return courseList;
    }
}
