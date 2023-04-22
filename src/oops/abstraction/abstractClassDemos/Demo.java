package oops.abstraction.abstractClassDemos;

public class Demo {
    //we cant write abstract method in a concrete class. we get CTE
    //abstract void m2();
    void m1(){
        System.out.println("concrete method");
    }
    public static void main(String[] args) {
        //we cant the object of abstract class or an interface
            //MessageService messageService = new MessageService();//CTE
        MessageService messageService = new MessageServiceImpl();
        //SB, IB, CON
    }

}
