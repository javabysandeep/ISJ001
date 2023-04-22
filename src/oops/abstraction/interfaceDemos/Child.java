package oops.abstraction.interfaceDemos;

public class Child implements I1, I2{
    @Override
    public void m1() {
        System.out.println("m1");
    }

    @Override
    public void m2() {
        System.out.println("m2");
    }
}
