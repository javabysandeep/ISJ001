package classComponents.nestedClasses;

public class Outer {
    int a = 100;
    void m1(){
        System.out.println("instance method of outer class");
    }
    //non-static nested class: inner class : instance class
    class Inner{
        int a = 100;
        // we can only write non-static members[IV, IM, IB, IC, Con]
        void m1(){
            System.out.println("m1 from inner class");
        }

        //we cannot write static members inside the inner class
        /*static int b = 200;
        static void m2(){}
        static {}
        static class Nested{}*/
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        System.out.println(outer.a);
        outer.m1();

        //accessing the inner class with the help of outer class reference variable
        // if we want to create object of inner class we need reference of outer class object
        Inner inner = outer.new Inner();
        System.out.println(inner.a);
        inner.m1();

    }

}
