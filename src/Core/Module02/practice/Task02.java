package Core.Module02.practice;

import java.util.Arrays;

import static Core.Module02.homework.AllTasksInOne.fillArray;

public class Task02 {
    public static void main(String[] args) {
        int[] array = new int[100];
        fillArray(array);
        System.out.println(Arrays.toString(array));
        int n = 6;
        System.out.println(n);
        int k = 0;
        for (int i : array) {
            if (i == n) {
                k++;
            }
        }
        if (k == 0) {
            System.out.println("NO");
        } else if (k == 1){
            System.out.println("YES");
        } else {
            System.out.println(k);
        }
    }
}
