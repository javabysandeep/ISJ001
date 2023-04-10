package accessSpecifier.p2;

import accessSpecifier.p1.A;

public class B {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.p);
        /*System.out.println(a.q);
        System.out.println(a.r);
        System.out.println(a.s);*/
    }
}
