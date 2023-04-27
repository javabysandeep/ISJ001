package oops.java8Features.lambdaExpresion;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class DisplayTest {
    public DisplayTest() {
        System.out.println("Constructor value");
    }
    void print(){
        System.out.println("printing something");
    }

    public static void main(String[] args) {
//        Display display = ()->{};
        Display display = DisplayTest::new;//constrctor ref
        DisplayTest displayTest = new DisplayTest();
        Display display1 = displayTest::print;
        display.display();

        //methods reference
        //1. static method ClassName::methodName
        //2. Constructor reference ClassName::new
        //3. Instance methods ref ---: reference::instanceMethodName

    }
}
