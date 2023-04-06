package classComponents.thisKeyword;

public class Student {
    int id;
    String name;

    Student(){
        System.out.println("Zero param constructor");
    }
    Student(int id, String name) {
        // assign local variable to the instance variable
        //we are assigning local variable value to itself

        this();//we are calling no-args constructor from param constructor
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {
        Student student = new Student(1, "Sachin");
        System.out.println(student.id + "\t" + student.name);
    }
}
