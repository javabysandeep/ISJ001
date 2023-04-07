package classComponents.blocks;

public class A {
    int x;
    int y;
    static int z = 100;

    {
        x++;
        y++;
        z++;
    }

    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new A();
        A a3 = new A();
        A a4 = new A();
        A a5 = new A();
    }
}
