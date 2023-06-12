package dao;

import model.Student;

import java.util.List;

public interface StudentDao {
    void addStudent(Student student);
    void editStudent(Student student);
    void deleteStudent(int studentId);
    Student getStudentDetailsById(int studentId);
    List<Student> getStudentDetailsByName(String studentName);
    List<Student> getStudentDetailsByEmail(String email);
    List<Student> getStudentDetailsByPhone(int phone);
    List<Student> getAllStudents();
}
