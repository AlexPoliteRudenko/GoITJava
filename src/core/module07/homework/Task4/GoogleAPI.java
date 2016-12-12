package core.module07.homework.Task4;

import java.util.ArrayList;
import java.util.List;

public class GoogleAPI extends APIAbstract {
    public GoogleAPI() {
        List<Room> roomsSet = new ArrayList<>();

        roomsSet.add(new Room(3291874345L, 300, 1, 2016, 12, 20, "Hilton", "Kyiv"));
        roomsSet.add(new Room(4567446375L, 200, 1, 2016, 12, 19, "Hilton", "Kyiv"));
        roomsSet.add(new Room(3988746375L, 500, 2, 2016, 12, 5, "Hilton", "Kyiv"));
        roomsSet.add(new Room(1118983847L, 350, 2, 2016, 12, 4, "Hyatt", "Kyiv"));
        roomsSet.add(new Room(3281946375L, 500, 1, 2016, 12, 15, "Hyatt", "Kyiv"));
        this.setRooms(roomsSet);

    }


}
