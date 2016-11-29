package core.someSamples;

import java.util.Scanner;

/**
 * Task 5** (core.someSamples.RhombusPrinter)
 * Вывод в консоль ромба размера size (нечетное число). Если size – четное или
 * отрицательное, бросить исключение IllegalArgumentException.
 */
public class RhombusPrinter {
    public static void main(String[] args) {
//Input
        Scanner rhombusSizeInput = new Scanner(System.in);
        System.out.print("Enter rhombus size, please (odd number): ");
        int size = rhombusSizeInput.nextInt();
//BL
        int i, j;
        for (i = 0; i < size; i++)
            if ((size % 2) == 1 && size > 0){
                int mid = size / 2 + 1;
                for (i = 1; i <= size; i++){
                    for (j = 1; j <= size; j++){
                        if (j == mid - i + 1 || j == i - mid + 1 || j == mid + i - 1 || j == size + mid - i){
                            System.out.print(" * ");
                        } else {
                            System.out.print(" . ");
                        }
                        if (j == size){
                            System.out.println();
                        }
                    }
                }
            } else throw new IllegalArgumentException();
//close
        rhombusSizeInput.close();
    }
}