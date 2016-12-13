package core.module07.practice;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<User> listUser = new ArrayList<>();
        Random r = new Random();
        long startTime = System.currentTimeMillis();
        for (int i = 1; i <= 10_000; i++) {
            listUser.add(new User(randomName(r.nextInt(6)), randomSurname(r.nextInt(6)), r.nextInt(101)));
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
        Collections.sort(listUser);

        Collections.sort(listUser, new UserSort());
        ArrayList<User> filteredListUser = new ArrayList<>();

        for (User user : listUser) {
            if (user.getAge() <= 21) {
                filteredListUser.add(user);
            }
        }
        for (User user : filteredListUser) {
            System.out.println(user);
        }

    }

    public static String randomSurname(int i) {
        switch (i) {
            case 0:
                return "Ivanov";
            case 1:
                return "Rudenko";
            case 2:
                return "Stepanenko";
            case 3:
                return "Alexandroff";
            case 4:
                return "Lobachev";
        }
        return "Sergienko";
    }

    public static String randomName(int i) {
        switch (i) {
            case 0:
                return "Ivan";
            case 1:
                return "Stepan";
            case 2:
                return "Petro";
            case 3:
                return "Alex";
            case 4:
                return "Vova";
        }
        return "Sergiy";
    }
}
