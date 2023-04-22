package oops.abstraction.interfaceDemos;

import java.util.List;

public interface StudentService {
    void registerStudent();
    void update(int studentId);
    void delete(int studentId);
    String getStudentDetailsById(int studentId);
    List<String> getAllStudents();
    void bulkUploadStudent();
}
