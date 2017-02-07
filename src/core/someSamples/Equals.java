package core.someSamples;

import java.util.ArrayList;
import java.util.List;

public class Equals {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 200; i++) {
            list.add(i);
        }
        for (int i = 0; i < 200; i++) {
            System.out.print(i);
            System.out.println(list.get(i) == Integer.valueOf(i));
        }
    }
}
