package oops.java8Features.lambdaExpresion;

import com.sun.deploy.util.StringUtils;

import java.util.function.Predicate;

public class PasswordValidator {
    public static void main(String[] args) {
        Predicate<String> passValidator = (password) -> password != null && password.length() > 10;
        System.out.println(passValidator.test("admin"));
    }
}
