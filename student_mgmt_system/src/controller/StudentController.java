package controller;

import model.Student;
import service.StudentService;
import service.StudentServiceImpl;

import java.util.List;

public class StudentController {
    StudentService studentService = new StudentServiceImpl();
    public void addStudent(Student student) {

        studentService.addStudent(student);
    }

    public void editStudent(Student student) {

    }

    public void deleteStudent(int studentId) {

    }

    public Student getStudentDetailsById(int studentId) {
        return null;
    }

    public List<Student> getStudentDetailsByName(String studentName) {
        return null;
    }

    public List<Student> getStudentDetailsByEmail(String email) {
        return null;
    }

    public List<Student> getStudentDetailsByPhone(int phone) {
        return null;
    }

    public List<Student> getAllStudents() {
        return null;
    }
}
