package Core.Module03.Homework.Task3_2;

import Core.Module03.Homework.Task3_1.Bird;

public class Main {
    public static void main(String[] args) {
        Arithmetic arithmetic = new Arithmetic();
        Adder adder = new Adder();
        System.out.println(arithmetic.add(12, 34));
        System.out.println(adder.check(12, 34));

    }
}
