package jdbc;

public class InheritanceTest {
    public static void main(String[] args) {
        //Parent parent  = new Parent();//static block--> instance block --> no arguments constructor
        System.out.println("Child class object creation");
        Parent parent = new Child();
        parent.m1();






        //static block of parent
        //static block of child
        //instance block parent class
        //constructor of parent class
        //instance block child class
        //constructor of child class
    }
}
