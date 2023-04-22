package oops.inheritance;

public class Example1 {
    public static void main(String[] args) {
        A a = new A();
        B b  = new B();
        b.m1(500);
        A ab = new B();//Parent class reference = child class object
        //CTE//B ba = new A();// Child class reference = Parent class Object
    }
}
