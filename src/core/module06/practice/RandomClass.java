package core.module06.practice;

import java.util.Arrays;
import java.util.Random;

public class RandomClass {
    public static void main(String[] args) {
        int from = 12;
        int to = 25;
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = randomValue(from, to);
        }
        System.out.println(Arrays.toString(array));
    }

    private static int randomValue(int from, int to) {
        Random random = new Random();
        return from + random.nextInt(to - from + 1);
    }
}
