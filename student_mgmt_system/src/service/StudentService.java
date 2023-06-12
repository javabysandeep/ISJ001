package service;

import model.Student;

import java.util.List;

public interface StudentService {
    /*
    * 	1. Add new student [Single, Bulk, File Upload]
	2. Edit the student
	3. Delete the student
	4. List of All Students
	5. Search based on name, email, phone
	6. Bulk edit
	7. Bulk delete
	8. Sorted list of students
    * */
    void addStudent(Student student);
    void editStudent(Student student);
    void deleteStudent(int studentId);
    Student getStudentDetailsById(int studentId);
    List<Student> getStudentDetailsByName(String studentName);
    List<Student> getStudentDetailsByEmail(String email);
    List<Student> getStudentDetailsByPhone(int phone);
    List<Student> getAllStudents();

}
