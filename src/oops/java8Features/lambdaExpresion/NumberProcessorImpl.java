package oops.java8Features.lambdaExpresion;

public class NumberProcessorImpl implements NumberProcessor {
    @Override
    public int process(int number) {
        return number * number;
    }

    public static void main(String[] args) {
        NumberProcessor numberProcessor = new NumberProcessorImpl();
        System.out.println(numberProcessor.process(10));


        //2. anonymous class way
        NumberProcessor cube = new  NumberProcessor() {
            @Override
            public int process(int number) {
                return number * number;
            }
        };
        System.out.println(cube.process(10));
    }
}
