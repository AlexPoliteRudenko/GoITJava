package Core.Module02.practice;

import java.util.Arrays;

import static Core.Module02.practice.FactorialCycle.getN;

public class ArrayMatrix {
    public static void main(String[] args) {
        int n = getN();
        int[][] arrayMatrix = CreateArrayMatrix(n);

    }

    public static int[][] CreateArrayMatrix(int n) {
        int[][] arrayMatrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            arrayMatrix[i] = createRandomArray(n);
        }
        return arrayMatrix;
    }

    private static int[] createRandomArray(int n) {
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()*101);
        }
        System.out.println(Arrays.toString(array));

        return array;
    }
}
