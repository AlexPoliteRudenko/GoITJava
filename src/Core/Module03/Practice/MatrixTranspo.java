package Core.Module03.Practice;

import static Core.Module02.practice.ArrayMatrix.createRandomArray;
import static Core.Sample.matrixPrinter;

import static Core.Module02.practice.FactorialCycle.getN;

public class MatrixTranspo {
    public static void main(String[] args) {
        int n = getN();
        int[][] arrayMatrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            arrayMatrix[i] = createRandomArray(n);
        }

        matrixPrinter(arrayMatrix);
    }
}
