package classComponents.constructors.copyConstructor;

public class Demo {
    int a;
    int b;
    Demo(int x, int y){
        a = x;
        b = y;
    }
    Demo(Demo demo){
        a = demo.a;
        b = demo.b;
    }

    public static void main(String[] args) {
        Demo demo1 = new Demo(10,20);
        System.out.println("Demo1 "+demo1.a+"\t"+demo1.b);

        Demo demo2 = new Demo(demo1);
        System.out.println("Demo2 "+demo2.a+"\t"+demo2.b);

    }
}
