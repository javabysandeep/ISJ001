package oops.abstraction.abstractClassDemos;

abstract public class B extends A{
    int a = 100;
    abstract void m2();

    public B() {
        super();
        //1. call to the super class constructor
        //2. call instance block of the same class
        System.out.println("B constructor");
    }
}
