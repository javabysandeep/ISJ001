package oops.inheritance;

public class AccountTest {
    public static void main(String[] args) {
        SavingAccount savingAccount = new SavingAccount(101,100000,6);
        System.out.println("Savings Account Details "+savingAccount.getAccountNumber()+"\t"+
                savingAccount.getBalance()+"\t"+savingAccount.getInterest());

        savingAccount.deposit(5000);
        System.out.println("Amount deposited");
        System.out.println("Savings Account Details "+savingAccount.getAccountNumber()+"\t"+
                savingAccount.getBalance()+"\t"+savingAccount.getInterest());

        System.out.println("Amount withdraw");
        savingAccount.withdraw(50000);
        System.out.println("Savings Account Details "+savingAccount.getAccountNumber()+"\t"+
                savingAccount.getBalance()+"\t"+savingAccount.getInterest());
    }
}
