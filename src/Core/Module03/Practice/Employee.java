package Core.Module03.Practice;

public class Employee extends Person {
    private String adress;
    private int salary;
    private int id;
    private static int counter;

    public Employee(String name, String surname, String gender, String adress, int slary) {
        super(name, surname, gender);
        this.adress = adress;
        this.salary = slary;
        counter++;
        this.id = counter;
    }

    public int getId() {
        return id;
    }

    public String getAdress() {
        return adress;
    }

    public int getSalary() {
        return salary;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
