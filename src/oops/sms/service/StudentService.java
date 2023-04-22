package oops.sms.service;

import oops.sms.model.Student;

import java.util.List;

public interface StudentService {
    void add(Student student);

    void update(Student student);

    void delete(int studentId);

    Student getStudentDetails(int studentId);

    List<Student> getAllStudents();
}
