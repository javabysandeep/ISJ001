package accessSpecifier.p3;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student();
        /*student.studentId = 100;
        student.studentName = "Saurabh";*/
        student.setStudentId(100);
        student.setStudentName("saurabh");
        System.out.println(student.getStudentId());
        System.out.println(student.getStudentName());

    }
}
