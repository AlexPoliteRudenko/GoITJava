package core.module07.homework;

import core.module04.homework.Currency;

import java.util.*;

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

        Order order1 = new Order(34565, 600, grn, "Nokia", "Rozetka", alex);
        Order order2 = new Order(36437, 1000, usd, "Samsung", "CityCom", vano);
        Order order3 = new Order(67634, 1550, grn, "Samsung ", "Rozetka", pasha);
        Order order4 = new Order(73236, 600, usd, "Bicycle", "Rozetka", pasha2);
        Order order12 = new Order(73236, 600, usd, "Bicycle", "Rozetka", pasha2);
        Order order5 = new Order(79856, 1200, grn, "Nokia", "CityCom", kate);
        Order order6 = new Order(47838, 1500, usd, "Samsung", "Rozetka", kate2);
        Order order7 = new Order(11873, 900, grn, "Notebook", "Rozetka", olga);
        Order order8 = new Order(68755, 8000, grn, "Notebook", "CityCom", olga2);
        Order order9 = new Order(12445, 600, usd, "Notebook", "CityCom", serg);
        Order order10 = new Order(97643, 26000, grn, "Notebook", "Rozetka", serg2);
        Order order11 = new Order(97643, 26000, grn, "Notebook", "Rozetka", serg2);

        //---------------------------------------------------------------------------------
        List<Order> orders = new ArrayList<>();
        Collections.addAll(orders, order1,order2, order3, order4, order12, order5, order6, order7, order8, order9, order10, order11);
        PrintSortResult(orders, "source list:");

        //---------------------------------------------------------------------------------
        orders.sort(new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                return o2.getPrice() - o1.getPrice();
            }
        });
        PrintSortResult(orders, "sorted list by price in decrase order");

        //---------------------------------------------------------------------------------
        orders.sort(new SortByIncreasePriceAndCity());
        PrintSortResult(orders, "sorted list by price and city");

        //---------------------------------------------------------------------------------
        orders.sort(new SortByItemShopCity());
        PrintSortResult(orders, "sorted list by itemName and shopIdentificator and city");

        //---------------------------------------------------------------------------------
        List<Order> ordersUnique = new ArrayList<>();
        Iterator iter = orders.iterator();
        while (iter.hasNext()) {
            Order elem =(Order) iter.next();
            if (!ordersUnique.contains(elem)) {
                ordersUnique.add(elem);
            }
        }
        PrintSortResult(ordersUnique, "deleted duplicates in list");

        //---------------------------------------------------------------------------------
        iter = ordersUnique.iterator();
        while (iter.hasNext()) {
            Order elem =(Order) iter.next();
            if (elem.getPrice() < 1500) {
                iter.remove();
            }
        }
        PrintSortResult(ordersUnique, "deleted items with price less then 1500");

        /*Collection<Order> set1 = new HashSet<>(orders);    //  It's working, but i'm not sure it's a good idea
        PrintSortResult(set1, "deleted duplicates in list");

        Iterator iter = set1.iterator();
        while (iter.hasNext()) {
            Order elem =(Order) iter.next();
            if (elem.getPrice() < 1500) {
                iter.remove();
            }
        }
        PrintSortResult(set1, "deleted items with price less then 1500");*/

        //---------------------------------------------------------------------------------
        Map<Currency, List<Order>> sepCurrency = seperateCurrency(orders);
        System.out.println(sepCurrency.toString());
        System.out.println();

        //---------------------------------------------------------------------------------
        Map<String, List<Order>> sepCity = seperateCity(orders);
        System.out.println(sepCity.toString());
        System.out.println();

    }

    private static Map<Currency, List<Order>> seperateCurrency(Collection<Order> orders) {
        Map<Currency, List<Order>> map = new HashMap<>();
        Iterator iter = orders.iterator();
        while (iter.hasNext()) {
            Order elem =(Order) iter.next();
            if (map.containsKey(elem.getCurrency())) {
                List<Order> list = map.get(elem.getCurrency());
                list.add(elem);
            } else {
                List<Order> list = new ArrayList<>();
                list.add(elem);
                map.put(elem.getCurrency(),list);
            }
        }

        return map;
    }
    private static Map<String, List<Order>> seperateCity(Collection<Order> orders) {
        Map<String, List<Order>> map = new HashMap<>();
        Iterator iter = orders.iterator();
        while (iter.hasNext()) {
            Order elem =(Order) iter.next();
            if (map.containsKey(elem.getUser().getCity())) {
                List<Order> list = map.get(elem.getUser().getCity());
                list.add(elem);
            } else {
                List<Order> list = new ArrayList<>();
                list.add(elem);
                map.put(elem.getUser().getCity(),list);
            }
        }

        return map;
    }

    public static void PrintSortResult(Collection<Order> orders, String s) {
        System.out.println("---------------------------" + s + "---------------------------");
        System.out.println(orders);
        System.out.println();
    }
}
