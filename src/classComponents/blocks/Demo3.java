package classComponents.blocks;

public class Demo3 {
    {
        System.out.println("instance block");
    }
    static {
        System.out.println("static block  or static initializer or static constructor");
    }

    Demo3(){
        System.out.println("zero param con");
    }
    public static void main(String[] args) {
        Demo3 d = new Demo3();
    }
}
