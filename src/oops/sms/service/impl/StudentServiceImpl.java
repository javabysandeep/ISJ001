package oops.sms.service.impl;

import oops.sms.dao.StudentDao;
import oops.sms.dao.impl.StudentDaoImpl;
import oops.sms.model.Student;
import oops.sms.service.StudentService;

import java.util.List;

public class StudentServiceImpl implements StudentService {
    StudentDao studentDao = new StudentDaoImpl();

    @Override
    public void add(Student student) {
        studentDao.add(student);
    }

    @Override
    public void update(Student student) {
        studentDao.update(student);
    }

    @Override
    public void delete(int studentId) {
        studentDao.delete(studentId);
    }

    @Override
    public Student getStudentDetails(int studentId) {
        return studentDao.getStudentDetails(studentId);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentDao.getAllStudents();
    }
}
