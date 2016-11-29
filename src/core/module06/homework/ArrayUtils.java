package core.module06.homework;

import java.util.Arrays;

public final class ArrayUtils {

    public static int secondLargest(int[] array) {
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

    public static double secondLargest(double[] array) {
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


    public static int max(int array[]) {
        int max = array[0];
        for (int item : array) {
            if (max < item) {
                max = item;
            }
        }
        return max;
    }

    public static double max(double array[]) {
        double max = array[0];
        for (double item : array) {
            if (max < item) {
                max = item;
            }
        }
        return max;
    }


    public static int min(int array[]) {
        int min = array[0];
        for (int item : array) {
            if (min > item) {
                min = item;
            }
        }
        return min;
    }

    public static double min(double array[]) {
        double min = array[0];
        for (double item : array) {
            if (min > item) {
                min = item;
            }
        }
        return min;
    }


    public static void maxPositive(int[] array) {
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

    public static void maxPositive(double[] array) {
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

    public static void fillArray(double[] array) {

        for (int i = 0; i < array.length; i++) {
            array[i] = (Math.random() * 100 - 50);
        }

    }


    public static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    public static void printArray(double[] array) {
        System.out.println(Arrays.toString(array));
    }


    public static int sum(int array[]) {
        int sum = 0;
        for (int item : array) {
            sum += item;
        }
        return sum;
    }

    public static double sum(double array[]) {
        double sum = 0;
        for (double item : array) {
            sum += item;
        }
        return sum;
    }


    public static int multiplication(int[] array) {
        int result = 1;

        for (int item : array) {
            result *= item;
        }
        return result;
    }

    public static double multiplication(double[] array) {
        double result = 1;

        for (double item : array) {
            result *= item;
        }
        return result;
    }


    public static void modulus(int[] array) {
        if (array[0] != 0) {
            System.out.println("Result of modulus(int array[]) method: " + array[0] % array[array.length - 1]);
        } else {
            System.out.println("Result of modulus(int array[]) method: Sorry, error occured - you can't devide on zero");
        }
    }

    public static void modulus(double[] array) {
        if (array[0] != 0) {
            System.out.println("Result of modulus(int array[]) method: " + array[0] % array[array.length - 1]);
        } else {
            System.out.println("Result of modulus(int array[]) method: Sorry, error occured - you can't devide on zero");
        }
    }


    public static int[] reverse(int[] arrayInt) {
        int[] newArray = new int[arrayInt.length];
        for (int i = 0; i < arrayInt.length; i++) {
            newArray[i] = arrayInt[arrayInt.length - 1 - i];
        }
        return newArray;
    }


    public static double[] reverse(double[] arrayDouble) {
        double[] newArray = new double[arrayDouble.length];
        for (int i = 0; i < arrayDouble.length; i++)
            newArray[i] = arrayDouble[arrayDouble.length - 1 - i];
        return newArray;
    }

    public static int[] findEvenElements(int[] arrayInt) {
        int[] arrayEven = new int[0];
        for (int iter : arrayInt) {
            if (iter % 2 == 0) {
                int[] arrayTemp = new int[arrayEven.length + 1];
                for (int i = 0; i < arrayEven.length; i++) {
                    arrayTemp[i] = arrayEven[i];
                }
                arrayTemp[arrayTemp.length - 1] = iter;
                arrayEven = arrayTemp;
            }
        }
        return arrayEven;
    }
}
