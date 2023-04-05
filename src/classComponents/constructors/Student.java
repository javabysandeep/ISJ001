package classComponents.constructors;

public class Student {
    int id;
    String name;
    Student(){
       System.out.println("constructor");
       id = 1;
       name = "abc";
    }
    public static void main(String[] args) {
        Student student1 = new Student();
        System.out.println(student1.id+"\t"+student1.name);

        Student student2 = new Student();
        System.out.println(student2.id+"\t"+student2.name);
    }
}
