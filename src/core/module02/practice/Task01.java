package core.module02.practice;

import java.util.Arrays;

public class Task01 {
    public static void main(String[] args) {
        int[] balances = {1040, 5400, 4321, 900, -5000, 1001};
        String[] names = {"Vlad", "Alexandr", "Denis", "Kate", "Susan", "Pasha"};

        System.out.println(sum(balances));
        int count = 0;
        for (int i : balances) {
            if (i > 1000) {
                count++;
            }
        }
        String[] ownerNames = new String[count];
        int indexOwners = 0;
        for (int i = 0; i < names.length; i++) {
            if (balances[i] > 1000) {
                ownerNames[indexOwners] = names[i];
                indexOwners++;
            }
        }

        System.out.println(Arrays.toString(ownerNames));

    }

    private static int sum(int[] array) {
        int sum = 0;
        for (int i : array) {
            if (i > 1000 && i <= 5000) {
                sum += i;
            }
        }
        return sum;
    }
}
