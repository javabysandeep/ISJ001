package oops.java8Features.lambdaExpresion;

import java.util.function.Predicate;

public class PredicateTest {
    public static void main(String[] args) {
        Predicate<Integer> isEven = (number) -> number % 2 == 0;
        System.out.println(isEven.test(100));
        System.out.println(isEven.test(99));

        Predicate<String> isPasswordLengthSufficient = (password) -> password.length()>=10;
        System.out.println("Is Password length sufficient "+isPasswordLengthSufficient.test("password"));
    }
}
