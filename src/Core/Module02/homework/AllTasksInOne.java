package Core.Module02.homework;

import java.util.Arrays;

public class AllTasksInOne {
    public static void main(String[] args) {
        //        input

        int[] arrayInt = new int[10];
        double[] arrayDouble = new double[10];
        fillArray(arrayInt);
//        int[] arrayInt = {2, 3, -5, 5, 9, 9, -10, -4, 1, -7};
        fillArray(arrayDouble);
        System.out.println("Array with random int values: ");
        printArray(arrayInt);
        System.out.println("Array with random double values: ");
        printArray(arrayDouble);
        System.out.println();

//        BL

//        output

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

    private static int secondLargest(int[] array) {
        int secondLargest = 0;
        int max = array[0];
        boolean firstMaxCheck = false;
        for (int i = 1; i < array.length; i++) {
            if (max <= array[i]) {
                secondLargest = max;
                max = array[i];
                firstMaxCheck = true;
            }

        }
        if (!firstMaxCheck) {
            secondLargest = array[1];
            for (int i = 1; i < array.length; i++) {
                if (secondLargest < array[i]) {
                    secondLargest = array[i];
                }
            }
        }
        return secondLargest;
    }


    private static double secondLargest(double[] array) {
        double secondLargest = 0;
        double max = array[0];
        boolean firstMaxCheck = false;
        for (double item : array) {
            if (max <= item) {
                secondLargest = max;
                max = item;
                firstMaxCheck = true;
            }
        }
        if (!firstMaxCheck) {
            secondLargest = array[1];
            for (int i = 1; i < array.length; i++) {
                if (secondLargest < array[i]) {
                    secondLargest = array[i];
                }
            }
        }

        return secondLargest;
    }


    private static int max(int array[]) {
        int max = array[0];
        for (int item : array) {
            if (max < item) {
                max = item;
            }
        }
        return max;
    }

    private static double max(double array[]) {
        double max = array[0];
        for (double item : array) {
            if (max < item) {
                max = item;
            }
        }
        return max;
    }

    private static int min(int array[]) {
        int min = array[0];
        for (int item : array) {
            if (min > item) {
                min = item;
            }
        }
        return min;
    }

    private static double min(double array[]) {
        double min = array[0];
        for (double item : array) {
            if (min > item) {
                min = item;
            }
        }
        return min;
    }


    private static void maxPositive(int[] array) {
        int maxPositive = array[0];
        for (int item : array) {
            if (maxPositive < item) {
                maxPositive = item;
            }
        }
        if (maxPositive > 0) {
            System.out.println("Result of maxPositive(int array[]) method: " + maxPositive);
        } else {
            System.out.println("Result of maxPositive(int array[]) method: Sorry, this array have no positive values.");
        }
    }

    private static void maxPositive(double[] array) {
        double maxPositive = array[0];
        for (double item : array) {
            if (maxPositive < item) {
                maxPositive = item;
            }
        }
        if (maxPositive > 0) {
            System.out.println("Result of maxPositive(double array[]) method: " + maxPositive);
        } else {
            System.out.println("Result of maxPositive(doible array[]) method: Sorry, this array have no positive values.");
        }
    }

    public static void fillArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 101 - 50);
        }

    }

    private static void fillArray(double[] array) {

        for (int i = 0; i < array.length; i++) {
            array[i] = (Math.random() * 100 - 50);
        }

    }

    private static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    private static void printArray(double[] array) {
        System.out.println(Arrays.toString(array));
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


    private static void modulus(int[] array) {
        if (array[0] != 0) {
            System.out.println("Result of modulus(int array[]) method: " + array[0] % array[array.length - 1]);
        } else {
            System.out.println("Result of modulus(int array[]) method: Sorry, error occured - you can't devide on zero");
        }
    }

    private static void modulus(double[] array) {
        if (array[0] != 0) {
            System.out.println("Result of modulus(int array[]) method: " + array[0] % array[array.length - 1]);
        } else {
            System.out.println("Result of modulus(int array[]) method: Sorry, error occured - you can't devide on zero");
        }
    }

}
