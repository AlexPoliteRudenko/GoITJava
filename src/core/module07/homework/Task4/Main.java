package core.module07.homework.Task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Room> result = new ArrayList<>();
        System.out.println("Search room:");
        Controller control = new Controller();
        result = control.requstRooms(150, 2, "Kyiv", "Hilton");
        System.out.println(result);
        result = control.requstRooms(400, 2, "Kyiv", "Hyatt");
        System.out.println(result);
        result = control.requstRooms(500, 1, "Kyiv", "Hyatt");
        System.out.println(result);


        System.out.println("Check similar rooms in different apies:");
        List<API> apiArray = control.getApis();
        result = control.check(apiArray.get(0), apiArray.get(1));
        System.out.println(result);
        result = control.check(apiArray.get(0), apiArray.get(2));
        System.out.println(result);
        result = control.check(apiArray.get(2), apiArray.get(1));
        System.out.println(result);

        System.out.println("Processing with DB:");
        Room room;
//        room = control.save(apiArray.get(0).);
        result = control.getDataBase().getAll();
        System.out.println(result);

    }

}

