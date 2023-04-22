package oops.sms.controller;

import oops.sms.model.Student;
import oops.sms.service.StudentService;
import oops.sms.service.impl.StudentServiceImpl;

import java.util.List;

public class StudentController {
    StudentService studentService = new StudentServiceImpl();
    public void add(Student student) {
        studentService.add(student);
    }

    public void update(Student student) {
        studentService.update(student);
    }

    public void delete(int studentId) {
        studentService.delete(studentId);
    }

    public Student getStudentDetails(int studentId) {
        return studentService.getStudentDetails(studentId);
    }

    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }
}
