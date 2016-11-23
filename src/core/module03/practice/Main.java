package core.module03.practice;

import java.util.Arrays;
import java.util.Comparator;

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
        Employee worker1 = new EmployeeFullTime("Ivan", "Ivanov", "male", "Some Str 111", 8000);
        Employee worker2 = new EmployeeFullTime("Vasyl", "Vasylyev", "male", "Some Str 222", 10000);
        Employee worker3 = new EmployeePartTime("Vera", "Brezhneva", "female", "Some Str 333", 2000);
        Employee worker4 = new EmployeeFullTime("Ilon", "Mask", "male", "Some Str 000", 400000);
        Employee worker5 = new EmployeePartTime("Bill", "Murray", "male", "Some Str 444", 3000);
        Employee worker6 = new EmployeePartTime("Ella", "Fitzherald", "female", "Some Str 555", 10000);
        Employee worker7 = new EmployeeFullTime("Yulya", "Timoshenko", "female", "Some Str 888", 400000);
        Employee worker8 = new EmployeePartTime("Olga", "Urumova", "female", "Some Str 777", 3000);
        Employee worker9 = new EmployeePartTime("Robert", "Williams", "male", "Some Str 999", 10000);
        Employee worker10 = new EmployeePartTime("Robert", "De Niro", "male", "Some Str 666", 3000);
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
//            System.out.println(workers[i].getId() + " " + workers[i].getSurname() +
//                    " " + workers[i].getName() + ", " + workers[i].getGender() +
//                    ", gets " + workers[i].avgMonthSalary());
            System.out.println(workers[i].toString());
            salarySum += workers[i].avgMonthSalary();
        }
        Arrays.sort(workers, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return 0;
            }
        });
        System.out.println(salarySum);
    }
}
