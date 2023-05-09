package stringHandling;

import com.sun.deploy.util.StringUtils;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator2 {
    public static void main(String[] args) {
        System.out.println("Enter the password");
        Scanner scanner = new Scanner(System.in);
        String password = scanner.next();
        final Pattern pattern = Pattern.compile("[a-z][A-Z][0-9]");
        final Matcher matcher = pattern.matcher(password);
        System.out.println(matcher.matches());
    }

}
