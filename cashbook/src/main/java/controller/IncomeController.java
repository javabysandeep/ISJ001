package controller;

import model.Income;
import service.IncomeService;

import java.util.List;

public class IncomeController {

    IncomeService incomeService = new IncomeService();

    public void addIncome(Income income) {
        incomeService.addIncome(income);
    }

    public void editIncome(Income income) {
        incomeService.editIncome(income);
    }

    public void deleteIncome(Income income) {
        incomeService.deleteIncome(income);
    }

    public Income getIncomeById(int incomeId) {
        return incomeService.getIncomeById(incomeId);
    }

    public List<Income> getAllIncomes() {
        return incomeService.getAllIncomes();
    }

    public List<Income> filterIncomes(Income income) {
        return incomeService.filterIncomes(income);
    }
}
