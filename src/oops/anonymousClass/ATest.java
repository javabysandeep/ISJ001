package oops.anonymousClass;

public class ATest {
    public static void main(String[] args) {
        A a = new A(){
            void m1(){
                System.out.println("M1 in anonymous class");
            }
        };
        a.m1();
    }
}
