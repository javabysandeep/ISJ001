package jdbc;

import java.lang.reflect.Method;

public class MethodReference {
    public static void main(String[] args) {
        StringProcessor stringProcessor = (input)-> System.out.println(input);//method definition
        stringProcessor.process("greetings");

        MethodReference methodReference = new MethodReference();
        StringProcessor method = MethodReference::new;
        method.process("method reference");
    }

    public  void m1(String str){
        System.out.println("input "+str);
    }
    MethodReference(String str){
        System.out.println(str);
    }
    MethodReference(){}
}
