package oops.objectClassDemos;

public class EqualsDemo {
    public static void main(String[] args) {
        Student student1 = new Student(1,"abc");
        Student student2 = new Student(1,"abc");


        System.out.println(10==10);//true

        System.out.println(student1 == student2);//false
        System.out.println(student1.equals(student2));//false
        System.out.println(student1==student1);//true
        System.out.println(student1.equals(student1));//true
    }
}
