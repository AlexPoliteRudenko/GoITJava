package Core.Module02.practice;

import java.util.Arrays;

import static Core.Module02.homework.AllTasksInOne.fillArray;

public class task04 {
    public static void main(String[] args) {
        int[] array = new int[20];
        fillArray(array);
        printArray(array);
//        Bubble ascending sorting
        bubbleAscendingSorting(array);
        printArray(array);
        System.out.println();
        fillArray(array);
        printArray(array);
//        Bubble descending sorting
        bubbleDescendingSorting(array);
        printArray(array);

    }

    public static void bubbleAscendingSorting(int[] array) {
        int sortCheck;
        int buffer;

        do {
            sortCheck = 0;
            int i = 0;
            do {
                if (array[i] > array[i + 1]) {
                    buffer = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = buffer;
                    sortCheck++;
                }
                i++;
            } while (i + 1 < array.length);
        } while (sortCheck > 0);
    }
    public static void bubbleDescendingSorting(int[] array) {
        int sortCheck;
        int buffer;

        do {
            sortCheck = 0;
            int i = 0;
            do {
                if (array[i] < array[i + 1]) {
                    buffer = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = buffer;
                    sortCheck++;
                }
                i++;
            } while (i + 1 < array.length);
        } while (sortCheck > 0);
    }

    private static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }
}
