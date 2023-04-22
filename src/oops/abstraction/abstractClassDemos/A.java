package oops.abstraction.abstractClassDemos;

abstract public class A {
    int a = 10;

    public int getA() {
        return a;
    }

    abstract void m1();

    public A() {
        //1. call to the super class constructor
        //2. call instance block of the same class
        System.out.println("A constructor");
    }
}
