package classComponents.thisKeyword;

import java.time.LocalDate;

public class Expense {
    int expenseId;
    String expenseDescription;
    int expenseAmount;
    String expenseDate;

    //no-args constructor
    public Expense() {
    }

    //all args constructor


    public Expense(int expenseId, String expenseDescription, int expenseAmount, String expenseDate) {
        this.expenseId = expenseId;
        this.expenseDescription = expenseDescription;
        this.expenseAmount = expenseAmount;
        this.expenseDate = expenseDate;
    }

    //setter: it sets the value for instance variables
    void setExpenseAmount(int expenseAmount){
        this.expenseAmount = expenseAmount;
    }

    //getter: it returns the value for the instance variables
    int getExpenseAmount(){
//        return expenseAmount;
        return this.expenseAmount;
    }

    public static void main(String[] args) {
        Expense expense = new Expense(1,"Dinner",4500,"6th April 2023");

        expense.expenseAmount = 5500;
        expense.setExpenseAmount(5500);


        System.out.println(expense.expenseAmount);
        System.out.println(expense.getExpenseAmount());

    }
}
