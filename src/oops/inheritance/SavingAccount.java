package oops.inheritance;

public class SavingAccount extends Account{
    private double interest;
    public SavingAccount(){}
    public SavingAccount(int accountNumber, double balance, double interest){
        super(accountNumber, balance);
        this.interest = interest;
        //super.accountNumber = accountNumber;
        //super.balance = balance;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }
}
