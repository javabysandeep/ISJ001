package classComponents.nestedClasses;

public class InnerTest {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.a);
        a.m1();

        System.out.println("Accessing innner class members");
        //acces inner class
        A.B b = a.new B();
        System.out.println("Inner class instance variable "+b.a);
        b.m1();
    }
}
