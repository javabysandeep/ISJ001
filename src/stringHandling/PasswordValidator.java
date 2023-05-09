package stringHandling;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        System.out.println("Enter the password");
        Scanner scanner = new Scanner(System.in);
        String password = scanner.next();
        System.out.println((isValidPassword(password) ? "Valid Password" : "Invalid Password"));
    }

    //null
    //abc
    //abcd1234567890111213456778888
    private static boolean isValidPassword(String password) {
        /*
        * 	1. Length should be greater than 10 and max 20
	        2. Atleast one uppercase
	        3. Atleast one lowercase
	        4. Atlest one special character
	        5. Atleast one Digit
        * */
        String specialCharacters = "@#$_-";
        if (null == password || (password.length() < 10 || password.length() > 20)) {
            return false;
        }

        boolean isUppercase = false;
        boolean isLowercase = false;
        boolean isSpecialCharacter = false;
        boolean isDigit = false;
        for (char ch : password.toCharArray()) {
            if(ch>='a' && ch<='z'){
                isLowercase= true;
            }
            if(ch>='A' && ch<='Z'){
                isUppercase= true;
            }
            if(ch>='0' && ch<='9'){
                isDigit= true;
            }
            if(specialCharacters.contains(String.valueOf(ch))){
                isSpecialCharacter = true;
            }
        }
        return isDigit && isLowercase && isUppercase && isSpecialCharacter;
    }
}
