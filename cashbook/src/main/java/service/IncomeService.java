package service;

import dao.IncomeDao;
import model.Income;

import java.util.List;

public class IncomeService {
    IncomeDao incomeDao = new IncomeDao();

    public void addIncome(Income income) {
        incomeDao.addIncome(income);
    }

    public void editIncome(Income income) {
        incomeDao.editIncome(income);
    }

    public void deleteIncome(Income income) {
        incomeDao.deleteIncome(income);
    }

    public Income getIncomeById(int incomeId) {
        return incomeDao.getIncomeById(incomeId);
    }

    public List<Income> getAllIncomes() {
        return incomeDao.getAllIncomes();
    }

    public List<Income> filterIncomes(Income income) {
        return incomeDao.filterIncomes(income);
    }
}
