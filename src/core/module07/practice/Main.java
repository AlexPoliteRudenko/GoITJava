package core.module07.practice;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<User> listUser = new ArrayList<>();
        String name = "Ivan";
        String surname = "Ivanov";
            Random r = new Random(100);
        long startTime = System.currentTimeMillis();
        for (int i = 1; i <= 10_000; i++) {
            listUser.add(new User(randomName(r.nextInt(5)),randomSurname(r.nextInt(5)), r.nextInt(100)));
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);

        Collections.sort(listUser, new UserSort());
        ArrayList<User> filteredListUser = new ArrayList<>();

        for (User user : listUser) {
            if (user.getAge() >= 21) {
                filteredListUser.add(user);
            }
        }
        for (User user : filteredListUser) {
            System.out.println(user);
        }

    }

    private static String randomSurname(int i) {
        switch (i) {
            case 0:
                return "Ivanov";
            case 1:
                return "Rudenko";
            case 2:
                return "Stepanenko";
            case 3:
                return "Alexandoff";
            case 4:
                return "Lobachev";
        }
        return "Sergienko";
    }

    private static String randomName(int i) {
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
