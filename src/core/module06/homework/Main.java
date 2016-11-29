package core.module06.homework;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        User alex = new User(1, "Alex", "Popov", 20000, 50000);
        User vano = new User(2, "Ivan", "Ivanov", 5000, 300);
        User pasha = new User(3,"Pavel", "Pavlov", 8000, 2000);
        User pasha2 = new User(3,"Pavel", "Pavlov", 8000, 2000);
        User kate = new User(4, "Kate", "Lyutych", 10000, 3000);
        User olga = new User(5, "Olga", "Urumova", 50000, 30000);
        User olga2 = new User(5, "Olga", "Urumova", 50000, 30000);

        System.out.println("Sourse array:");
        User[] users = {alex, vano, pasha, kate, olga, olga2, pasha2};
        UserUtils.printUsersArray(users);
        System.out.println();

        System.out.println("First test. Unique users array:");
        User[] usersUnique = UserUtils.uniqueUsers(users);
        UserUtils.printUsersArray(usersUnique);
        System.out.println();

        System.out.println("Second test. Paying salary for unique users.");
        usersUnique = UserUtils.paySalaryToUsers(usersUnique);
        UserUtils.printUsersArray(usersUnique);
        System.out.println();

        System.out.println("Third test. Search users in source array with balance == 30000");
        User[] usersWithBalance = UserUtils.usersWithContitionalBalance(users, 30000);
        UserUtils.printUsersArray(usersWithBalance);
        System.out.println();

        System.out.println("Fourth test. Print array of all unique users id:");
        long[] usersId = UserUtils.getUsersId(usersUnique);
        System.out.println(Arrays.toString(usersId));
        System.out.println();

        System.out.println("Fifth test.");
        System.out.println("Deleting 3 and 6 users from source array...");
        users[2] = null;
        users[5] = null;
        System.out.println("Success! Result:");
        UserUtils.printUsersArray(users);
        System.out.println("Deleting null elements from source array...");
        users = UserUtils.deleteEmpty(users);
        UserUtils.printUsersArray(usersUnique);
        System.out.println("Success!");

    }
}
