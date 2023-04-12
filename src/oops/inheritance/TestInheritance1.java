package oops.inheritance;

public class TestInheritance1 {
    public static void main(String[] args) {
        Child child = new Child();
       // System.out.println(child.a);//private in parent class
        System.out.println(child.b);
        System.out.println(child.c);
        System.out.println(child.d);

        child.m1();
        //child.m2();// private method in Parent class
        child.m3();
        child.m4();
    }
}
