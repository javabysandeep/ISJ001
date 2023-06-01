package jdbc;

public class Parent {
    Parent() {
        //parent class constructor
        //instance block
        System.out.println("no arguments constructor of Parent class");
    }

    {
        System.out.println("instance block of parent class");
    }

    static {
        System.out.println("static block of parent class");
    }
    void m1(){
        System.out.println("m1 method parent");
    }
}
