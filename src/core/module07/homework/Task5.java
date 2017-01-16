package core.module07.homework;

import core.module07.practice.User;

import java.util.*;

import static core.module07.practice.Main.randomName;
import static core.module07.practice.Main.randomSurname;

public class Task5 {

    public static void solution() {
        System.out.println();
        System.out.println("---------------------------task 5---------------------------");
        System.out.println();
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        LinkedList<String> stringLinkedList = new LinkedList<>();
        int n = 100_000;
        fillMeasure(integerArrayList, n);
        fillMeasure(stringLinkedList, n);
        setMeasure(integerArrayList, n);
//        setMeasure(stringLinkedList, n);     //too long!
        getMeasure(integerArrayList, n);
//        getMeasure(stringLinkedList, n);     //too long!
        removeMeasure(integerArrayList, n);
        removeMeasure(stringLinkedList, n);
        System.out.println();
        System.out.println("--------------------------------------------------------------------");
        System.out.println("=========================== End of task 5===========================");
        System.out.println("--------------------------------------------------------------------");
        System.out.println();
    }

    private static<T> void removeMeasure(List<T> list, int n) {
        Iterator iter = list.iterator();
        long startTime = System.currentTimeMillis();
        while (iter.hasNext()) {
            T elem = (T) iter.next();
            iter.remove();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Removing from " + list.getClass().getSimpleName() +
                " for " + n + " Integer elements using .remove method lasts: " + (endTime - startTime) + " ms");
    }

    private static<T> void getMeasure(List<T> list, int n) {
        long startTime = System.currentTimeMillis();
        for (int i = 1; i <= n; i++) {
            list.get(i - 1);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Geting from " + list.getClass().getSimpleName() +
                " for " + n + " String lines using .get method lasts: " + (endTime - startTime) + " ms");
    }

    public static void fillMeasure(ArrayList<Integer> list, int n) {
        Random r = new Random();
        long startTime = System.currentTimeMillis();
        for (int i = 1; i <= n; i++) {
            list.add(r.nextInt(1000));
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Filling " + list.getClass().getSimpleName() +
                " with " + n + " Integers using .add method lasts: " + (endTime - startTime) + " ms");
    }
    public static void fillMeasure(LinkedList<String> list, int n) {
        Random r = new Random();
        long startTime = System.currentTimeMillis();
        for (int i = 1; i <= n; i++) {
            list.add("some text" + r.nextInt(1000));
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Filling " + list.getClass().getSimpleName() +
                " with " + n + " String lines using .add method lasts: " + (endTime - startTime) + " ms");
    }

    public static void setMeasure(ArrayList<Integer> integers, int n) {
        Random r = new Random();
        long startTime = System.currentTimeMillis();
        for (int i = 1; i <= n; i++) {
            integers.set(i - 1, r.nextInt(1000));
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Seting " + integers.getClass().getSimpleName() +
                " with " + n + " Integers using .set method lasts: " + (endTime - startTime) + " ms");
    }
    public static void setMeasure(LinkedList<String> list, int n) {
        Random r = new Random();
        long startTime = System.currentTimeMillis();
        for (int i = 1; i <= n; i++) {
            list.set(i - 1, "some text" + r.nextInt(1000));
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Seting " + list.getClass().getSimpleName() +
                " with " + n + " String lines using .set method lasts: " + (endTime - startTime) + " ms");
    }
}
