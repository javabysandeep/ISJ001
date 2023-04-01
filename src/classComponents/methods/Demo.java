package classComponents.methods;

public class Demo {
    //from instance  call another instance :
        // we can call directly
    void m1(){
        m2();
    }
    void m2(){

    }

    //from static call another static
        // directly
        // using class name also
    static void m3(){
        m4();
        Demo.m4();
    }
    static void m4(){}



    //3. from instance  call another static
        //directly
        // classname
    void m5(){
        m6();
        Demo.m6();
    }
    static void m6(){}


    //4. from static call another instance
        // we need reference variable
    public static void main(String[] args) {
        //m7();//CTE
        Demo demo = new Demo();
        demo.m7();
    }
    void m7(){}
}
