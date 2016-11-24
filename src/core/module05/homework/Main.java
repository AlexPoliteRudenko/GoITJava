package core.module05.homework;

public class Main {
    public static void main(String[] args) {
        Room[] result;

        Controller control = new Controller();
        result = control.requstRooms(150, 2, "Kyiv", "Hilton");
        printResult(result);
        result = control.requstRooms(400, 2, "Kyiv", "Hyatt");
        printResult(result);
        result = control.requstRooms(500, 1, "Kyiv", "Hyatt");
        printResult(result);


        System.out.println("Check similar rooms in different apies:");
        API[] apiArray = control.getApis();
        result = control.check(apiArray[0], apiArray[1]);
        printResult(result);
        result = control.check(apiArray[0], apiArray[2]);
        printResult(result);
        result = control.check(apiArray[2], apiArray[1]);
        printResult(result);
    }

    private static void printResult(Room[] result) {
        for (int i = 0; i < result.length; i++) {
            if (result[i] != null) {
                System.out.println(result[i].toString());
            }
        }
        System.out.println();
    }
}

