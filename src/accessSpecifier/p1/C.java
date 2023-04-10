package accessSpecifier.p1;

public class C {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.p);
        //System.out.println(a.q);//private
        System.out.println(a.r);
        System.out.println(a.s);
    }
}
