package core.module10.homework;

import core.module09.homework.Order;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        testTask02();
        testTask03();
        testTask04();

        try {
            testTask05();
        } catch (FException | EException | GException e) {
            System.out.println(e);
        }

    }

    private static void testTask05() throws FException, EException, GException {
        Random random = new Random();
        switch (random.nextInt(3)) {
            case 0:
                throw new EException();
            case 1:
                throw new FException();
            case 2:
                throw new GException();
        }
    }

    private static void testTask04() {
        TestExceptionClassA a = new TestExceptionClassA();
        try {
            a.f();
        } catch (FException e) {
            System.out.println("Cought Task 4 f() exception");
        }
    }

    private static void testTask03() {
        Order order = null;
        try {
            System.out.println(order.toString());
        } catch (NullPointerException e) {
            System.out.println("Task 3 - NPE");
        }

    }

    private static void testTask02() {
        try {
            throw new MyException("Task 2 exception");
        } catch (MyException e) {
            e.printMessage();
        }
    }
}
