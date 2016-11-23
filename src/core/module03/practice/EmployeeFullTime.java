package core.module03.practice;

public class EmployeeFullTime extends Employee {
    private int monthSalary;

    @Override
    public double avgMonthSalary() {
        return getMonthSalary();
    }


    public EmployeeFullTime(String name, String surname, String gender, String adress, int monthSalary) {
        super(name, surname, gender, adress);
        this.monthSalary = monthSalary;
        setAvgMonthSalary(avgMonthSalary());
    }

    public void setMonthSalary(int monthSalary) {
        this.monthSalary = monthSalary;
    }

    public int getMonthSalary() {

        return monthSalary;
    }

}
