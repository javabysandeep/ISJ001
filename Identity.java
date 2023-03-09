public class Identity {
    //comments are ignored for both compilation as well execution

//Non-negotiable Rules for Identifier:
    // 1. allowed characters : a-z, A-Z, 0-9, $, _[Underscore and not hyphen]
            // If any other chacter is used, we get compile time error.
    // 2. Class, variable, method, package name should not start with digit.
            // we can use the digit in between, or at the end of identifier
    //3. Keywords must not be used as a identifier.

// Suggestions or good programming practices
    //1. We should not use pre-defined class names as identifier.
        // if we use it we won't get any CTE or RTE 
        //it just reducess the code redability
    
    //2. Names of the Classes, Interfaces should follow Upper camel case.
        // class MessageService {}
        // class NotificationService{}
    
    //3. Names of the variable, methods, packages should follow lower camel case.
        // String accountHolderName  =  "abc";
        // int accountNumber = 123456;
        // int mobileNumber = 7899;
        // void saveStudentDetails(){}
        // void transferMoney(){}
    public static void main(String[] arguments) {
        int public = 100;
        System.out.println("Hello");
        
    }
}