package core.module03.practice;

public abstract class Employee extends Person {
    private String adress;
//    private int salary;
    private int id;
    private static int counter;
    private double avgMonthSalary;

    public abstract double avgMonthSalary();

    public Employee(String name, String surname, String gender, String adress) {
        super(name, surname, gender);
        this.adress = adress;
//        this.salary = slary;
        counter++;
        this.id = counter;
    }

    public void setAvgMonthSalary(double avgMonthSalary) {
        this.avgMonthSalary = avgMonthSalary;
    }

    public double getAvgMonthSalary() {

        return avgMonthSalary;
    }

    @Override
    public String toString() {
        return id + " " + super.toString() +
                "   Employee{" + " adress = '" + adress + '\'' +
                ", avgMonthSalary = " + avgMonthSalary +
                "} " ;
    }

    public int getId() {
        return id;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

}
