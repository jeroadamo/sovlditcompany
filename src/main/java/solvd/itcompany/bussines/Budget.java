package solvd.itcompany.bussines;

public class Budget {

    int companyBudget;

    public Budget(int companyBudget) {
        this.companyBudget = companyBudget;
    }

    public int getCompanyBudget() {
        return companyBudget;
    }

    public void setCompanyBudget(int companyBudget) {
        this.companyBudget = companyBudget;
    }

    @Override
    public String toString() {
        return "Company budget: " + companyBudget;
    }

}
