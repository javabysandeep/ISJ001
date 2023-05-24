package java8Features;


public class Implementation1Traditional implements StringProcessor {
    @Override
    public void process() {
        System.out.println("String processor impl using ");
    }

    public static void main(String[] args) {
        StringProcessor stringProcessor = new Implementation1Traditional();
        stringProcessor.process();
    }
}
