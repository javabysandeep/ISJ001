package classComponents.blocks;

public class Demo {
    int a;
    static int b=100;

    public Demo() {
        System.out.println("zero param con");
    }

    public Demo(int a) {
        this.a = a;
    }
    void m1(){
        System.out.println("instance method");
    }

    static  void m2(){
        System.out.println("static method");
    }

    public static void main(String[] args) {
        Demo demo = new Demo();



    }

    //instance block
    {
        int a = 100;
        System.out.println("instance block");
    }

    //static block
    static {
        System.out.println("static block");
    }
}
