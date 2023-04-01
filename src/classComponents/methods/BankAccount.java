package classComponents.methods;

public class BankAccount {
    //instance methods
    void checkBalance() {
        System.out.println("Balance is zero");
    }

    void deposit(int amount) {
        System.out.println("Money deposite " + amount);
    }

    //static method
    static void getInterestRate(){
        System.out.println("Rate of interest is 3%");
    }

    public static void main(String[] args) {
        //job main method is to start the program execution
        BankAccount bankAccount = new BankAccount();
        //accessing the instance method
        bankAccount.checkBalance();//call to the instance method

        // accessing the static method
        //getInterestRate();//call to the static method
        BankAccount.getInterestRate();
        //bankAccount.getInterestRate();
    }



}
