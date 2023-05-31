package genericCode;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class Lambda {
    public static void main(String[] args) {
        Predicate<Integer> predicate = (integer) -> integer % 2 == 0;
        System.out.println(predicate.test(100));

        Function<String, Integer> function =
                (string)->string.length();
        System.out.println("String length "+function.apply("welcome to generic coding"));

        BiFunction<Integer, Integer, Integer>  biFunction  = (number1, number2)->number1+number2;

        Processor<String, Integer> processor = String::length;

        NumberProcessor numberProcessor = input -> input * input;
        System.out.println(numberProcessor.process(10));
    }
}
