package classComponents.constructors.chaining;

public class Demo {
    Demo(){
        this(10.0,20.0);
        System.out.println("zero param");
    }
    Demo(int a){
        this(10,20);
        System.out.println("one param");
    }
    Demo(int a, int b){
        this(10.0,20.0);
        System.out.println("two param int");
    }
    Demo(double a, double b){
        System.out.println("two double param");
    }

    public static void main(String[] args) {
        Demo demo = new Demo();
    }
}
