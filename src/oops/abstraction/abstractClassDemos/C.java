package oops.abstraction.abstractClassDemos;

public class C extends B{
    int a = 1000;
    public C() {
        //1. call to the super class constructor
        //2. call instance block of the same class
        super();
        System.out.println("C class constructor");
    }

    @Override
    void m1() {
        System.out.println("m1 from c class");
    }

    @Override
    void m2() {
        System.out.println("m2 from c class");
    }
    void display(){
        System.out.println("Displaying instance variable of C class "+this.a);
        System.out.println("Displaying instance variable of B class "+super.a);
        //System.out.println("Displaying instance variable of A class "+super.super.a);//CTE
        System.out.println("Displaying instance variable of A class "+getA());

    }
}
