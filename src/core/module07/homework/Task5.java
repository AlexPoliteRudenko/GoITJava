package core.module07.homework;

import core.module07.practice.User;

import java.util.*;

import static core.module07.practice.Main.randomName;
import static core.module07.practice.Main.randomSurname;

public class Task5 {
    private static List<User> measure;

    public static void solution() {
        System.out.println();
        System.out.println("---------------------------task 5---------------------------");
        System.out.println();
        List<User> listUser = new ArrayList<>();
        List<User> linkedListUser = new LinkedList<>();
        int n = 100_000;
        fillMeasure(listUser, n);
        fillMeasure(linkedListUser, n);
        setMeasure(listUser, n);
//        setMeasure(linkedListUser, n);     //too long!
        getMeasure(listUser, n);
//        getMeasure(linkedListUser, n);     //too long!
        removeMeasure(listUser, n);
        removeMeasure(linkedListUser, n);
        System.out.println();
        System.out.println("--------------------------------------------------------------------");
        System.out.println("=========================== End of task 5===========================");
        System.out.println("--------------------------------------------------------------------");
        System.out.println();
    }

    private static void removeMeasure(List<User> listUser, int n) {
        Iterator iter = listUser.iterator();
        long startTime = System.currentTimeMillis();
        while (iter.hasNext()) {
            User elem = (User) iter.next();
            iter.remove();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Removing from " + listUser.getClass().getSimpleName() +
                " for " + n + " users using .get method lasts: " + (endTime - startTime) + " ms");
    }

    private static void getMeasure(List<User> listUser, int n) {
        long startTime = System.currentTimeMillis();
        for (int i = 1; i <= n; i++) {
            listUser.get(i - 1);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Geting from " + listUser.getClass().getSimpleName() +
                " for " + n + " users using .get method lasts: " + (endTime - startTime) + " ms");
    }

    public static void fillMeasure(List<User> listUser, int n) {
        Random r = new Random();
        long startTime = System.currentTimeMillis();
        for (int i = 1; i <= n; i++) {
            listUser.add(new User(randomName(r.nextInt(6)), randomSurname(r.nextInt(6)), r.nextInt(101)));
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Filling " + listUser.getClass().getSimpleName() +
                " with " + n + " users using .add method lasts: " + (endTime - startTime) + " ms");
    }

    public static void setMeasure(List<User> listUser, int n) {
        Random r = new Random();
        long startTime = System.currentTimeMillis();
        for (int i = 1; i <= n; i++) {
            listUser.set(i - 1, new User(randomName(r.nextInt(6)), randomSurname(r.nextInt(6)), r.nextInt(101)));
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Seting " + listUser.getClass().getSimpleName() +
                " with " + n + " new users using .set method lasts: " + (endTime - startTime) + " ms");
    }
}
