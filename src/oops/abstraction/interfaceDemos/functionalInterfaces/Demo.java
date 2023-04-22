package oops.abstraction.interfaceDemos.functionalInterfaces;

public class Demo {
    public static void main(String[] args) {
        StringProcessor stringProcessor = new StringProcessorImpl();
        System.out.println("Length of the string is "+stringProcessor.process("welcome to IT Shaala"));
    }
}
