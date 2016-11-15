package Core.SomeSamples;

public class RecursianRadix {
    //Print decimal number using binary code
    private static void printDecimalToRadix(int number) {
        if (number < 0) {
            System.out.println("Number must be not negative");
            return;
        }
        if (number / 2 <= 0) {
            System.out.print(number % 2);
            return;
        } else {
            printDecimalToRadix(number / 2);
        }
        System.out.print(number % 2);
    }
    //Print decimal number using any set by user 0 < Radix < 10
    private static void printDecimalToRadix(int number, int radix) {
        if (radix == 0) {
            System.out.println("Radix must be in range 0..10");
            return;
        }
        if (number < 0) {
            System.out.println("Number must be not negative");
            return;
        }
        if (number / radix <= 0) {
            System.out.print(number % radix);
            return;
        } else {
            printDecimalToRadix(number / radix, radix);
        }
        System.out.print(number % radix);
    }

    public static void main(String[] args) {
        printDecimalToRadix(953);
        System.out.println();
        printDecimalToRadix(-953);
        System.out.println();
        printDecimalToRadix(953,3);
        System.out.println();
        printDecimalToRadix(953,4);
        System.out.println();
        printDecimalToRadix(953,5);
        System.out.println();
        printDecimalToRadix(953,6);
        System.out.println();
        printDecimalToRadix(953,7);
        System.out.println();
        printDecimalToRadix(953,8);
        System.out.println();
        printDecimalToRadix(953,9);
        System.out.println();
        printDecimalToRadix(953,0);
        System.out.println();
        printDecimalToRadix(-953,6);

    }
}
