package service;

import dao.StudentDao;
import dao.StudentDaoImpl;
import model.Student;

import java.util.List;

public class StudentServiceImpl implements StudentService{
    StudentDao studentDao = new StudentDaoImpl();
    @Override
    public void addStudent(Student student) {
        studentDao.addStudent(student);
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
