package oops.java8Features.methodReference;

public class PrintingTest {
    public static void main(String[] args) {
            Printer printer = (message)->{
                System.out.println("printing message "+message);
            };
            printer.print("hello");

            Printer methodRef = PrintingTest::display;
            methodRef.print("method reference ");

            Printer uppercase =(str)->{};
    }
    static void display(String message){
        System.out.println("printing "+message);
    }
}
