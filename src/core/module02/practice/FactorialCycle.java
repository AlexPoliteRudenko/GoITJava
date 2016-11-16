package core.module02.practice;

import java.util.Scanner;

public class FactorialCycle {
    public static void main(String[] args) {
        int n = getN();
        long factorial = getFactorial(n);
        System.out.println(n + "! = " + factorial);
    }

    public static long getFactorial(int n) {
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= n;
        }
        return factorial;
    }

    public static int getN() {
        System.out.print("Insert number > 1: ");
        Scanner numberN = new Scanner(System.in);
        return numberN.nextInt();
    }
}
