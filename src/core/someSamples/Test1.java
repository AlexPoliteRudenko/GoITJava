package core.someSamples;

public class Test1 {
    public static void main(String[] args) {
        int[] mass = new int[10];
        for (int i = 0; i < 10; i++) mass[i] = 2 * i + 1;

        for (int k = 0; k < 10; k++) System.out.println(mass[k] + ", ");
    }
}
