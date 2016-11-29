package core.module02.homework;

import core.module06.homework.ArrayUtils;

public class Main {
    public static void main(String[] args) {
        //        input

        int[] arrayInt = new int[10];
        double[] arrayDouble = new double[10];
        ArrayUtils.fillArray(arrayInt);
//        int[] arrayInt = {2, 3, -5, 5, 9, 9, -10, -4, 1, -7};
        ArrayUtils.fillArray(arrayDouble);
        System.out.println("Array with random int values: ");
        ArrayUtils.printArray(arrayInt);
        System.out.println("Array with random double values: ");
        ArrayUtils.printArray(arrayDouble);
        System.out.println();

//        BL

//        output

        System.out.println("Result of sum(int array[]) method: " + ArrayUtils.sum(arrayInt));
        System.out.println("Result of sum(double array[]) method: " + ArrayUtils.sum(arrayDouble));
        System.out.println();
        System.out.println("Result of min(int array[]) method: " + ArrayUtils.min(arrayInt));
        System.out.println("Result of min(double array[]) method: " + ArrayUtils.min(arrayDouble));
        System.out.println();
        System.out.println("Result of max(int array[]) method: " + ArrayUtils.max(arrayInt));
        System.out.println("Result of max(double array[]) method: " + ArrayUtils.max(arrayDouble));
        System.out.println();
        ArrayUtils.maxPositive(arrayInt);
        ArrayUtils.maxPositive(arrayDouble);
        System.out.println();
        System.out.println("Result of multiplication(int array[]) method: " + ArrayUtils.multiplication(arrayInt));
        System.out.println("Result of multiplication(double array[]) method: " + ArrayUtils.multiplication(arrayDouble));
        System.out.println();
        ArrayUtils.modulus(arrayInt);
        ArrayUtils.modulus(arrayDouble);
        System.out.println();
        System.out.println("Result of secondLargest(int array[]) method: " + ArrayUtils.secondLargest(arrayInt));
        System.out.println("Result of secondLargest(double array[]) method: " + ArrayUtils.secondLargest(arrayDouble));
        System.out.println();

        arrayInt = ArrayUtils.reverse(arrayInt);

        System.out.println("Array with random int values reversed: ");
        ArrayUtils.printArray(arrayInt);
        arrayDouble = ArrayUtils.reverse(arrayDouble);
        System.out.println("Array with random double values reversed: ");
        ArrayUtils.printArray(arrayDouble);
        System.out.println();

        System.out.println("Array with random even int values: ");
        ArrayUtils.printArray(ArrayUtils.findEvenElements(arrayInt));

    }

}
