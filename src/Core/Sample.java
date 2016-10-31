package Core;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Task 4** (PascalTriangleCreator)
 * Написать метод создания треугольника Паскаля размера n+1. Если n < 0, бросить
 * исключение IllegalArgumentException.
 * Хитрые формулы использовать не нужно. Просто найдите закономерность в
 * построении треугольника.
 * int[][] createPascalTriangle(int n) !!!!!!ИЗМЕНИЛ НА ТИП ДАННЫХ long!!!!!!
 * Пример работы:
 * createPascalTriangle(0) => { {1} }
 * createPascalTriangle(3) =>{ {1},
 * {1, 1},
 * {1, 2, 1},
 * {1, 3, 3, 1} }
 createPascalTriangle(-1)  IllegalArgumentException
 */
public class Sample {
    public static void main(String[] args) {
        int n = enterSize();
        checkNotNegative(n);
        int[][] matrix4 = new int[n + 1][];
        createPascalTriangle(n, matrix4);
        matrixPrinter(matrix4);
    }
    public static void createPascalTriangle(int n, int[][] matrix4) {
        for (int i = 1; i < n + 1; i++) {
            matrix4[i] = new int[i + 1];
            for (int j = 0; j < i + 1; j++) {
                if (j == 0 || j == i) {
                    matrix4[i][j] = 1;
                } else {
                    matrix4[i][j] = matrix4[i - 1][j - 1] + matrix4[i - 1][j];
                }
            }
        }
    }
    public static void checkNotNegative(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("You enter wrong number. Size must be >= 0");
        }
    }
    public static int enterSize() {
        System.out.print("Please, enter number of rows in Pascal Triangle: ");
        Scanner enterSize = new Scanner(System.in);
        return enterSize.nextInt();
    }
    public static void matrixPrinter(int[][] matrix) {
        int row = 0;
        for (int[] array : matrix) {
            System.out.print(row + ": ");
            System.out.println(Arrays.toString(array));
            row++;
        }
    }
}