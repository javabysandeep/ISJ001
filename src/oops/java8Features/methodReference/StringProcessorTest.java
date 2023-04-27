package oops.java8Features.methodReference;

public class StringProcessorTest {
    public static void main(String[] args) {
        StringProcessor stringProcessor = (str) -> str.toUpperCase();
        System.out.println("Uppercase " + stringProcessor.process("Welcome to  IT Shaala"));

        StringProcessor methodRef = String::toUpperCase;
        System.out.println("Using method reference "+methodRef.process("Welcome to  IT Shaala"));

    }
}
