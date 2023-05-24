package java8Features;

public class Implementation3Lambda {
    public static void main(String[] args) {
        StringProcessor stringProcessor = ()->
                System.out.println("string processing using lambda");
        stringProcessor.process();
    }
}
