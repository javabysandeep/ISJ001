package jdbc;

public class StringProcessorImpl implements StringProcessor {
    @Override
    public void process(String str) {
        System.out.println("input " + str);
    }

    public static void main(String[] args) {
        //1. traditional way to implement an interface
        StringProcessor stringProcessor = new StringProcessorImpl();
        stringProcessor.process("Greetings");

        //2. Anonymous class
        StringProcessor anonymousClass = new StringProcessor() {
            public void process(String str) {
                System.out.println("input " + str);
            }
        };
        anonymousClass.process(" anonymous class");

        //3. Lambda expression
        StringProcessor lambda = (input)-> System.out.println("lambda expression "+input);
        lambda.process("lambda");

        //4. method reference
        StringProcessor method = StringProcessorImpl::m1;
        method.process("input");


    }
    static void m1(String str){
        System.out.println(str);
    }
}
