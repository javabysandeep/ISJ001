package oops.inheritance;

public class B extends A {
    int a = 200;
    B() {
        //call to the parent class constructor
        super();
        System.out.println("B Child class");
    }
    void m1(int a){
        System.out.println(a);//local variable ---> 500
        System.out.println(this.a);//instance variable ---> 200
        System.out.println(super.a);//super class instance variable---> 100
    }
}
