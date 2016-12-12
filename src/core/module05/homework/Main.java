package core.module05.homework;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Room[] result;
        System.out.println("Search room:");
        Controller control = new Controller();
        result = control.requstRooms(150, 2, "Kyiv", "Hilton");
        System.out.println(Arrays.toString(result));
        result = control.requstRooms(400, 2, "Kyiv", "Hyatt");
        System.out.println(Arrays.toString(result));
        result = control.requstRooms(500, 1, "Kyiv", "Hyatt");
        System.out.println(Arrays.toString(result));


        System.out.println("Check similar rooms in different apies:");
        API[] apiArray = control.getApis();
        result = control.check(apiArray[0], apiArray[1]);
        System.out.println(Arrays.toString(result));
        result = control.check(apiArray[0], apiArray[2]);
        System.out.println(Arrays.toString(result));
        result = control.check(apiArray[2], apiArray[1]);
        System.out.println(Arrays.toString(result));

        System.out.println("Processing with DB:");
        Room room;
//        room = control.save(apiArray[0].);
        result = control.getDataBase().getAll();
        System.out.println(Arrays.toString(result));

    }

}

