package classComponents.thisKeyword;

public class Income {
    int incomeId;
    String incomeTitle;
    int incomeAmount;

    public Income() {
    }

    public Income(int incomeId, String incomeTitle, int incomeAmount) {
        this.incomeId = incomeId;
        this.incomeTitle = incomeTitle;
        this.incomeAmount = incomeAmount;
    }

    public int getIncomeId() {
        return incomeId;
    }

    public void setIncomeId(int incomeId) {
        this.incomeId = incomeId;
    }

    public String getIncomeTitle() {
        return incomeTitle;
    }

    public void setIncomeTitle(String incomeTitle) {
        this.incomeTitle = incomeTitle;
    }

    public int getIncomeAmount() {
        return incomeAmount;
    }

    public void setIncomeAmount(int incomeAmount) {
        this.incomeAmount = incomeAmount;
    }

    public static void main(String[] args) {
        Income income = new Income(1,"Salary",15000);
        //income.incomeAmount = 150000;
        income.setIncomeAmount(150000);
        income.setIncomeTitle("Freelance");

        System.out.println(income.incomeAmount);
        System.out.println(income.getIncomeAmount());
        System.out.println(income.getIncomeTitle());
    }
}
