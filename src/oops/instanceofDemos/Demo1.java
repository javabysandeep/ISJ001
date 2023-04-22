package oops.instanceofDemos;

public class Demo1 {
    public static void main(String[] args) {
        A a = new A();

        B b = new B();
        A ab = new B();
        C c = new C();
        A ac = new C();
        B bc = new C();
        System.out.println("A ref");
        System.out.println(a instanceof A);
        System.out.println(a instanceof B);
        System.out.println(a instanceof C);

        System.out.println("B ref");
        System.out.println(b instanceof  A);
        System.out.println(b instanceof  B);
        System.out.println(b instanceof  C);


        System.out.println("ab ref");
        System.out.println(ab instanceof  A);
        System.out.println(ab instanceof  B);
        System.out.println(ab instanceof  C);
    }
}
