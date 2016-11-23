package core.module03.practice;

public class EmployeePartTime extends Employee {
    private double salaryPerHour;

    @Override
    public double avgMonthSalary() {
        return 20.8 * 8 * getSalaryPerHour();
    }

    public EmployeePartTime(String name, String surname, String gender, String adress, double salaryPerHour) {
        super(name, surname, gender, adress);
        this.salaryPerHour = salaryPerHour;
        setAvgMonthSalary(avgMonthSalary());
    }

    public void setSalaryPerHour(double salaryPerHour) {
        this.salaryPerHour = salaryPerHour;
    }

    public double getSalaryPerHour() {

        return salaryPerHour;
    }
}
