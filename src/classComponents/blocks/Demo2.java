package classComponents.blocks;

public class Demo2 {
    {
        System.out.println("instance block1");
    }

    {
        System.out.println("instance block2");
    }

    {
        System.out.println("instance block3");
    }

    {
        System.out.println("instance block4");
    }

    {
        System.out.println("instance block5");
    }
    static {
        System.out.println("static block1");
    }
    static {
        System.out.println("static block2");
    }

    public static void main(String[] args) {
        Demo2 demo1 = new Demo2();
        Demo2 demo2 = new Demo2();
        Demo2 demo3 = new Demo2();
        Demo2 demo4 = new Demo2();
    }
}
