package oops.abstraction.abstractClassDemos;

public class Demo2 {
    public static void main(String[] args) {
        C c = new C();
        c.m1();
        c.m2();
        System.out.println("Instance variable of C : "+c.a);//1000

        A ac = new C();
        System.out.println("Instance variable of A: "+ac.a);//10
        ac.m1();
        //ac.m2();//CTE
        // P --> P
        //C --> CTE
        //PC ---> V-P, M-C

        B bc = new C();
        bc.m1();
        bc.m2();
        System.out.println("Instance variable B: "+bc.a);//100

        c.display();
    }
}
