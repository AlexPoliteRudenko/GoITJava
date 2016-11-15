package Core.Module03.Practice;

public class Main {
    public static void main(String[] args) {
/*
 //Triangle Class Test
        Triangle triangle1 = new Triangle(1, 1, 2, 2, 5, 0);
        Triangle triangle2 = new Triangle(1, 32, 2, 6, 5, 0);
        Triangle triangle3 = new Triangle(1, 1, 2, 2, 5, 5);
        triangle1.print();
        triangle2.print();
        triangle3.print();
*/
//Person & Employee Class Test
        Employee worker1 = new Employee("Ivan", "Ivanov", "male", "Some Str 111", 500);
        Employee worker2 = new Employee("Vasyl", "Vasylyev", "male", "Some Str 222", 600);
        Employee worker3 = new Employee("Vera", "Brezhneva", "female", "Some Str 333", 20000);
        Employee worker4 = new Employee("Ilon", "Mask", "male", "Some Str 000", 200000);
        Employee worker5 = new Employee("Bill", "Murray", "male", "Some Str 444", 2000);
        Employee worker6 = new Employee("Ella", "Fitzherald", "female", "Some Str 555", 30000);
        Employee worker7 = new Employee("Yulya", "Timoshenko", "female", "Some Str 888", 300000);
        Employee worker8 = new Employee("Olga", "Urumova", "female", "Some Str 777", 40000);
        Employee worker9 = new Employee("Robert", "Williams", "male", "Some Str 999", 10000);
        Employee worker10 = new Employee("Robert", "De Niro", "male", "Some Str 666", 15000);
        Employee[] workers = new Employee[10];
        workers[0] = worker1;
        workers[1] = worker2;
        workers[2] = worker3;
        workers[3] = worker4;
        workers[4] = worker5;
        workers[5] = worker6;
        workers[6] = worker7;
        workers[7] = worker8;
        workers[8] = worker9;
        workers[9] = worker10;
        int salarySum = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println(workers[i].getId() + " " + workers[i].getSurname() +
                    " " + workers[i].getName() + ", " + workers[i].getGender() +
                    ", gets " + workers[i].getSalary());
            salarySum += workers[i].getSalary();
        }
        System.out.println(salarySum);
    }
}
