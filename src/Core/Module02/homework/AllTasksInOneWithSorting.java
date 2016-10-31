package Core.Module02.homework;
import java.util.Arrays;

public class AllTasksInOneWithSorting {
    public static void main(String[] args) {

//        input

        int[] arrayInt = new int[10];
        double[] arrayDouble = new double[10];
        fillArray(arrayInt);
//        int[] arrayInt = {2, 3, -5, 5, 9, 9, -10, -4, 1, -7};
        fillArray(arrayDouble);
        System.out.println("Array with random int values:");
        printArray(arrayInt);
        System.out.println("Array with random double values:");
        printArray(arrayDouble);
        System.out.println();

//        BL
        sortArray(arrayInt);
        sortArray(arrayDouble);

//        output

        System.out.println("Sorted array with random int values:");
        printArray(arrayInt);
        System.out.println("Sorted array with random double values:");
        printArray(arrayDouble);
        System.out.println();
        System.out.println("Result of sum(int array[]) method: " + sum(arrayInt));
        System.out.println("Result of sum(double array[]) method: " + sum(arrayDouble));
        System.out.println();
        System.out.println("Result of min(int array[]) method: " + min(arrayInt));
        System.out.println("Result of min(double array[]) method: " + min(arrayDouble));
        System.out.println();
        System.out.println("Result of max(int array[]) method: " + max(arrayInt));
        System.out.println("Result of max(double array[]) method: " + max(arrayDouble));
        System.out.println();
        maxPositive(arrayInt);
        maxPositive(arrayDouble);
        System.out.println();
        System.out.println("Result of multiplication(int array[]) method: " + multiplication(arrayInt));
        System.out.println("Result of multiplication(double array[]) method: " + multiplication(arrayDouble));
        System.out.println();
        modulus(arrayInt);
        modulus(arrayDouble);
        System.out.println();
        System.out.println("Result of secondLargest(int array[]) method: " + secondLargest(arrayInt));
        System.out.println("Result of secondLargest(double array[]) method: " + secondLargest(arrayDouble));
        System.out.println();

    }

    private static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }
    private static void printArray(double[] array) {
        System.out.println(Arrays.toString(array));
    }

    private static int secondLargest(int[] array) {
        boolean checkIndex = false;
        int i = 0;
        do {
            if (array[array.length - 1 - i] > array[array.length - 2 - i]) {
                checkIndex = true;
            }
            i++;
        } while (!checkIndex);
        return array[array.length - 1 - i];
    }
    private static double secondLargest(double[] array) {
        boolean checkIndex = false;
        int i = 0;
        do {
            if (array[array.length - 1 - i] > array[array.length - 2 - i]) {
                checkIndex = true;
            }
            i++;
        } while (!checkIndex);
        return array[array.length - 1 - i];
    }

    private static void modulus(int[] array) {
        if (array[0] != 0) {
            System.out.println("Result of modulus(int array[]) method: " + array[array.length - 1] % array[0]);
        } else {
            System.out.println("Result of modulus(int array[]) method: Sorry, error occured - you can't devide on zero");
        }
    }

    private static void modulus(double[] array) {
        if (array[0] != 0) {
            System.out.println("Result of modulus(int array[]) method: " + array[array.length - 1] % array[0]);
        } else {
            System.out.println("Result of modulus(int array[]) method: Sorry, error occured - you can't devide on zero");
        }
    }

    private static int multiplication(int[] array) {
        int result = 1;

        for (int item : array) {
            result *= item;
        }
        return result;
    }

    private static double multiplication(double[] array) {
        double result = 1;

        for (double item : array) {
            result *= item;
        }
        return result;
    }

    private static void maxPositive(int[] array) {
        if (array[array.length - 1] > 0) {
            System.out.println("Result of maxPositive(int array[]) method: " + array[array.length - 1]);
        } else {
            System.out.println("Result of max(int array[]) method: this array have no positive values.");
        }

    }

    private static void maxPositive(double[] array) {
        if (array[array.length - 1] > 0) {
            System.out.println("Result of maxPositive(int array[]) method: " + array[array.length - 1]);
        } else {
            System.out.println("Result of max(int array[]) method: this array have no positive values.");
        }

    }

    private static int sum(int array[]) {
        int sum = 0;
        for (int item : array) {
            sum += item;
        }
        return sum;
    }

    private static double sum(double array[]) {
        double sum = 0;
        for (double item : array) {
            sum += item;
        }
        return sum;
    }


    private static int min(int array[]) {
        return array[0];
    }

    private static double min(double array[]) {
        return array[0];
    }

    private static int max(int array[]) {
        return array[array.length - 1];
    }

    private static double max(double array[]) {
        return array[array.length - 1];
    }

    private static void sortArray(int[] array) {
        int buffer;
        int step = array.length;
        int sortCheck;
        do {
            step = (int) (step / 1.24733d);
            do {
                sortCheck = 0;
                int i = 0;
                do {
                    if (array[i] > array[i + step]) {
                        buffer = array[i];
                        array[i] = array[i + step];
                        array[i + step] = buffer;
                        sortCheck++;
                    }
                    i++;
                } while (i + step < array.length);
            } while (sortCheck > 0);
        } while (step > 1);
    }

    private static void sortArray(double[] array) {
        double buffer;
        int step = array.length;
        int sortCheck;
        do {
            step = (int) (step / 1.24733d);
            do {
                sortCheck = 0;
                int i = 0;
                do {
                    if (array[i] > array[i + step]) {
                        buffer = array[i];
                        array[i] = array[i + step];
                        array[i + step] = buffer;
                        sortCheck++;
                    }
                    i++;
                } while (i + step < array.length);
            } while (sortCheck > 0);
        } while (step > 1);
    }

    private static void fillArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 21 - 10);
        }

    }

    private static void fillArray(double[] array) {

        for (int i = 0; i < array.length; i++) {
            array[i] = (Math.random() * 20 - 10);
        }

    }
}
