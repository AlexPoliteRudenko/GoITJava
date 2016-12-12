package core.module07.homework;

import core.module04.homework.Currency;

import java.util.*;

public class Task2 {
    public static void solution(List<Order> orders) {
        //---------------------------------------------------------------------------------
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
        Map<Currency, List<Order>> sepCurrency = separateCurrency(orders);
        System.out.println(sepCurrency.toString());
        System.out.println();

        //---------------------------------------------------------------------------------
        Map<String, List<Order>> sepCity = separateCity(orders);
        System.out.println(sepCity.toString());

        System.out.println();
        System.out.println("--------------------------------------------------------------------");
        System.out.println("=========================== End of task 2===========================");
        System.out.println("--------------------------------------------------------------------");
        System.out.println();

    }

    private static Map<Currency, List<Order>> separateCurrency(Collection<Order> orders) {
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
    private static Map<String, List<Order>> separateCity(Collection<Order> orders) {
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
