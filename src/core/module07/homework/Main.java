package core.module07.homework;

import core.module04.homework.Currency;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        User alex = new User(12, "Alex", "Popov", "Kyiv", 50000);
        User vano = new User(22, "Ivan", "Ivanov", "Kyiv", 300);
        User pasha = new User(34, "Pavel", "Pavlov", "Kyiv", 2000);
        User pasha2 = new User(32, "Pavel", "Petrov", "Kiev", 2000);
        User kate = new User(44, "Kate", "Petrova", "Lviv", 3000);
        User kate2 = new User(40, "Kate II", "The Great", "Lviv", 3000000);
        User olga = new User(56, "Olga", "Urumova", "Lviv", 30000);
        User olga2 = new User(75, "Olga", "Chaliy", "Lviv", 30000);
        User serg = new User(60, "Sergey", "Stanislavskiy", "Lviv", 43000);
        User serg2 = new User(65, "Sergey", "Aleksndrov", "Kyiv", 3000);
        
        Currency grn = Currency.UAH;
        Currency usd = Currency.USD;

        Order order1 = new Order(34565, 500, grn, "Nokia 1100", "Rozetka", alex);
        Order order2 = new Order(36437, 1000, usd, "Samsung Galaxy Note", "Rozetka", vano);
        Order order3 = new Order(67634, 1550, grn, "Samsung ", "Rozetka", pasha);
        Order order4 = new Order(73236, 600, usd, "Bicycle", "Rozetka", pasha2);
        Order order12 = new Order(73236, 600, usd, "Bicycle", "Rozetka", pasha2);
        Order order5 = new Order(79856, 1200, grn, "Prestigio Phone", "Rozetka", kate);
        Order order6 = new Order(47838, 1500, usd, "Quaddrocopter", "Rozetka", kate2);
        Order order7 = new Order(11873, 900, grn, "Notebook Dell", "Rozetka", olga);
        Order order8 = new Order(68755, 8000, grn, "Notebook HP", "Rozetka", olga2);
        Order order9 = new Order(12445, 400, usd, "Notebook Samsung", "Rozetka", serg);
        Order order10 = new Order(97643, 26000, grn, "Notebook GameX", "Rozetka", serg2);
        Order order11 = new Order(97643, 26000, grn, "Notebook GameX", "Rozetka", serg2);

        List<Order> orders = new ArrayList<>();
        orders.add(order1);
        orders.add(order2);
        orders.add(order3);
        orders.add(order4);
        orders.add(order12);
        orders.add(order5);
        orders.add(order6);
        orders.add(order7);
        orders.add(order8);
        orders.add(order9);
        orders.add(order10);
        orders.add(order11);
        System.out.println("source list:");
        System.out.println(orders);
//        orders.sort(Comparator.comparing());
    }
}
