package classComponents.nestedClasses;

public class Demo {
    // what
    //static nested class
    static class A{}

    //inner class  or non-static nested class or instance class
    class B{}

    public static void main(String[] args) {
        //local inner class
        class C{
            int a=100;
           /* static  int b = 200;
            static void m2(){}
            static {}
            static class Ne4sted{}*/
            void m1(){
                System.out.println("m1 method within local inner class");
            }
        }

        C c = new C();
        System.out.println(c.a);
        c.m1();

    }
}
