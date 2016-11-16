package core.module02.practice;

import java.util.Arrays;

import static core.module02.homework.AllTasksInOne.fillArray;

public class Task02 {
    public static void main(String[] args) {
        int[] array = new int[100];
        fillArray(array);
        System.out.println(Arrays.toString(array));
        /*System.out.println("Number " + n + " present in array " + HowManyTimesNInArray(array, 10) + " time(-s)");
        System.out.println("Number " + n + " present in array " + HowManyTimesNInArray(array, 40) + " time(-s)");
        System.out.println("Number " + n + " present in array " + HowManyTimesNInArray(array, 30) + " time(-s)");
        System.out.println("Number " + n + " present in array " + HowManyTimesNInArray(array, 6) + " time(-s)");
        System.out.println("Number " + n + " present in array " + HowManyTimesNInArray(array, 20) + " time(-s)");*/
        int k = 0;
        k = HowManyTimesNInArray(array, 7);
        printCoutnResult(k);
        k = HowManyTimesNInArray(array, 60);
        printCoutnResult(k);
        k = HowManyTimesNInArray(array, 23);
        printCoutnResult(k);
        k = HowManyTimesNInArray(array, 50);
        printCoutnResult(k);

    }

    public static void printCoutnResult(int k) {
        if (k == 0) {
            System.out.println(" NO");
        } else if (k == 1) {
            System.out.println(" YES");
        } else {
            System.out.println(" " + k);
        }
    }

    public static int HowManyTimesNInArray(int[] array, int n) {
        System.out.print("Count how many times number " + n + " present in array above. ");
        int k = 0;
        for (int i : array) {
            if (i == n) {
                k++;
            }
        }

        return k;
    }
}
