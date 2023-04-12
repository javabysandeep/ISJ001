package oops.inheritance;

public class Parent {
    private int a = 100;
    public int b = 200;
    protected int c = 300;
    int d = 400;

    public void m1() {
        System.out.println("Parent class m1");
    }

    private void m2() {
        System.out.println("Parent class m2");
    }

    protected void m3() {
        System.out.println("Parent class m3");
    }

    void m4() {
        System.out.println("Parent class m4");
    }
}
