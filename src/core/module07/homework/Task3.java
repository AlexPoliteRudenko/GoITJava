package core.module07.homework;

import core.module04.homework.Currency;

import java.util.*;

public class Task3 {
    public static void solution(Set<Order> set1) {
        System.out.println();
        System.out.println("---------------------------task 3---------------------------");
        System.out.println();
        Task2.PrintSortResult(set1, "source set");

        System.out.print("Checking, weather set contain order with user \'Petrov\': ");
        System.out.println(containLastName(set1, "Petrov"));
        System.out.println();

        //---------------------------------------------------------------------------------

        TreeSet<Order> ss = new TreeSet<>(set1);
        System.out.println(ss.last());
        System.out.println();
        //---------------------------------------------------------------------------------

        Iterator iter = set1.iterator();
        while (iter.hasNext()) {
            Order elem =(Order) iter.next();
            if (elem.getCurrency() == Currency.USD) {
                iter.remove();
            }
        }
        Task2.PrintSortResult(set1, "set with deleted orders, that contain currency USD");

        System.out.println();
        System.out.println("--------------------------------------------------------------------");
        System.out.println("=========================== End of task 3===========================");
        System.out.println("--------------------------------------------------------------------");
        System.out.println();
    }

    public static boolean containLastName(Set<Order> set1, String lastName) {
        boolean contains = false;
        for (Order order : set1) {
            if (order.getUser().getLastName().equals(lastName)) {
                contains = true;
            }
        }
        return contains;
    }
}
