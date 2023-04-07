package classComponents.nestedClasses;

public class A {
    int a = 100;
    void m1(){
        System.out.println("class A instance method");
    }
    //inner class
    class B{
        //inner class: only non-static members
        int a;
        void m1(){
            System.out.println("inner class instance method");
        }
    }
}
