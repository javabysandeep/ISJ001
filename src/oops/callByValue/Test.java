package oops.callByValue;

public class Test {
    public static void main(String[] args) {
        Student student = new Student(1, "abc");
        changeStudent(student);
        System.out.println("Id "+student.id+"\t"+" Name :"+student.name);//1 abc
    }
    static void changeStudent(Student student){
        student = new Student(3,"pqr");
        System.out.println("Id "+student.id+"\t"+" Name :"+student.name);//3 pqr
        student.id = 2;
        student.name = "xyz";
    }
}
