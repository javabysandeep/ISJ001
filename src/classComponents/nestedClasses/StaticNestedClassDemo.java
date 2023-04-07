package classComponents.nestedClasses;

public class StaticNestedClassDemo {
    static class Nested {
        //we can write both static and non-static members
        int a;
        void m1(){
            System.out.println("instance method from static nested class");
        }
        static  int b=100;
        static void m2(){
            System.out.println("static method from static nested class");
        }
    }
}
