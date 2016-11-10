package Core.Module03.Homework.Task3_4;

public class User {
    private String name;
    private int balance;
    private int monthsOfEmployment;
    private String companyName;
    private int salary;
    private String currency;


    void paySalary() {
        this.balance += salary;
    }

    void withdraw(int summ) {
        if (summ < 1000) {
            this.balance -= summ + summ * 5 / 100;
        } else {
            this.balance -= summ + summ * 10 / 100;

        }
    }

    int companyNameLength() {
        return this.companyName.length();
    }

    void monthsOfEmployment(int addMonth) {
        this.monthsOfEmployment += addMonth;
    }

    public User(String name, int balance, int monthsOfEmployment, String companyName, int salary, String currency) {
        this.name = name;
        this.balance = balance;
        this.monthsOfEmployment = monthsOfEmployment;
        this.companyName = companyName;
        this.salary = salary;
        this.currency = currency;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setMonthsOfEmployment(int monthsOfEmployment) {
        this.monthsOfEmployment = monthsOfEmployment;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public int getMonthsOfEmployment() {
        return monthsOfEmployment;
    }

    public String getCompanyName() {
        return companyName;
    }

    public int getSalary() {
        return salary;
    }

    public String getCurrency() {
        return currency;
    }
}
