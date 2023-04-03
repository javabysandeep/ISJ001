package classComponents.assignments;

public class Student {
    int rollNumber;
    String name;

    public static void main(String[] args) {
        Student student = new Student();//
        System.out.println(student.rollNumber + "\t" + student.name);

        student.rollNumber = 1;
        student.name = "abc";
        System.out.println(student.rollNumber + "\t" + student.name);

        Student sam = new Student();
        sam.name = "Sam";
        sam.rollNumber = 1;
        System.out.println("Sam details "+sam.rollNumber + "\t" + sam.name);



    }
}
