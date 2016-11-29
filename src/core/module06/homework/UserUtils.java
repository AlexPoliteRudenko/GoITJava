package core.module06.homework;

import java.util.Arrays;

public class UserUtils {
    public static User[] uniqueUsers(User[] users) {
        User[] usersUnique = new User[0];
        boolean isUnique;
        for (int i = 0; i < users.length; i++) {
            isUnique = false;
            for (int j = 0; j < users.length; j++) {
                if (j != i && users[i].equals(users[j])) {
                    isUnique = false;
                    break;
                }
                isUnique = true;
            }
            if (isUnique) {
                User[] usersTemp = new User[usersUnique.length + 1];
                for (int j = 0; j < usersUnique.length; j++) {
                    usersTemp[j] = usersUnique[j];
                }
                usersTemp[usersTemp.length - 1] = users[i];
                usersUnique = usersTemp;
            }
        }

        return usersUnique;
    }

    public static User[] usersWithContitionalBalance(User[] users, int balance) {
        User[] usersWithBalance = new User[0];
        for (int i = 0; i < users.length; i++) {
            if (users[i].getBalance() == balance) {
                User[] usersTemp = new User[usersWithBalance.length + 1];
                for (int j = 0; j < usersWithBalance.length; j++) {
                    usersTemp[j] = usersWithBalance[j];
                }
                usersTemp[usersTemp.length - 1] = users[i];
                usersWithBalance = usersTemp;
            }
        }
        return usersWithBalance;
    }

    public final static User[] paySalaryToUsers(User[] users) {
        for (User user : users) {
            user.setBalance(user.getBalance() + user.getSalary());
        }
        return users;
    }

    public final static long[] getUsersId(User[] users) {
        long[] usersId = new long[users.length];
        for (int i = 0; i < users.length; i++) {
            usersId[i] = users[i].getId();
        }
        return usersId;
    }

    public static User[] deleteEmpty(User[] users) {
        User[] usersNotEmpty = new User[0];
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null) {
                User[] usersTemp = new User[usersNotEmpty.length + 1];
                for (int j = 0; j < usersNotEmpty.length; j++) {
                    usersTemp[j] = usersNotEmpty[j];
                }
                usersTemp[usersTemp.length - 1] = users[i];
                usersNotEmpty = usersTemp;
            }
        }
        return usersNotEmpty;


    }

    public static void printUsersArray(User[] users) {
        System.out.println(Arrays.toString(users));
    }
}
