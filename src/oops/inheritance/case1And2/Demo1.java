package oops.inheritance.case1And2;

public class Demo1 {
    public static void main(String[] args) {

        //case 1:
        System.out.println("parent class");
        A a = new A();
        System.out.println(a.p);//100
        System.out.println(a.q);//200

        System.out.println("child class");
        B b = new B();
        System.out.println(b.p);//100
        System.out.println(b.q);//200

    }
}
