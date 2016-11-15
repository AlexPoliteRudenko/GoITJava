package Core.Module03.Practice;

public class Employee extends Person {
    private String adress;
    private int salary;
    private int identifyer;
    private static int id;

    public Employee(String name, String surname, String gender, String adress, int slary) {
        super(name, surname, gender);
        this.adress = adress;
        this.salary = slary;
        id++;
        this.identifyer = id;
    }

    public int getIdentifyer() {
        return identifyer;
    }

    public String getAdress() {
        return adress;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
