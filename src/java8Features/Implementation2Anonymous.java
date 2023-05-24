package java8Features;

public class Implementation2Anonymous {
    public static void main(String[] args) {

        StringProcessor stringProcessor = new StringProcessor() {
            @Override
            public void process() {
                System.out.println("String processing using anonymous class");
            }
        };

        stringProcessor.process();


    }
}
