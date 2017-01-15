package core.module09.practice;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static final String FIRST_NAME = "firstName";
    public static final String LAST_NAME = "lastName";
    public static final String EMAIL = "email";

    public static void main(String[] args) {
        try {
            Integer integer = 45;
            Number number = 3.0;
            long veryLong = 3_000_000_000L;
            int smallLong = 1;
            System.out.println(veryLong/smallLong);
            System.out.println(integer / (Integer) number);
            Integer result = Integer.valueOf("abc");
        } catch (ArithmeticException | ClassCastException e) {
            System.out.println("divide to zero!");
        } finally {
            System.out.println();
        }

    }
}
