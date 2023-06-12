package dao;

import model.Student;
import util.DBUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class StudentDaoImpl implements StudentDao {
    @Override
    public void addStudent(Student student) {
        // connection
        Connection connection = DBUtils.getConnection();
        String query = "insert into student (name, phone, email, address, gender, dob, class, batch) values(?,?,?,?,?,?,?,?)";
        PreparedStatement preparedStatement = DBUtils.getPreparedStatement(query);
        try {
            preparedStatement.setString(1, student.getName());
            preparedStatement.setInt(2, student.getPhone());
            preparedStatement.setString(3, student.getEmail());
            preparedStatement.setString(4, student.getAddress());
            preparedStatement.setString(5, student.getGender());
            preparedStatement.setDate(6, student.getDateOfBirth());
            preparedStatement.setString(7, student.getStudentClass());
            preparedStatement.setString(8, student.getBatch());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("issue in setting the values");
        }
        System.out.println("Student added");

    }

    @Override
    public void editStudent(Student student) {

    }

    @Override
    public void deleteStudent(int studentId) {

    }

    @Override
    public Student getStudentDetailsById(int studentId) {
        return null;
    }

    @Override
    public List<Student> getStudentDetailsByName(String studentName) {
        return null;
    }

    @Override
    public List<Student> getStudentDetailsByEmail(String email) {
        return null;
    }

    @Override
    public List<Student> getStudentDetailsByPhone(int phone) {
        return null;
    }

    @Override
    public List<Student> getAllStudents() {
        return null;
    }
}
