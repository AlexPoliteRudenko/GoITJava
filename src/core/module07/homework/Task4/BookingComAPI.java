package core.module07.homework.Task4;

import java.util.ArrayList;
import java.util.List;

public class BookingComAPI extends APIAbstract {
    public BookingComAPI() {
        List<Room> roomsSet = new ArrayList<>();
        roomsSet.add(new Room(4567483745L, 150, 2, 2016, 12, 15, "Hilton", "Kyiv"));
        roomsSet.add(new Room(4567446375L, 500, 1, 2016, 12, 4, "Hilton", "Kyiv"));
        roomsSet.add(new Room(1256446375L, 500, 1, 2016, 12, 3, "Hyatt", "Kyiv"));
        roomsSet.add(new Room(2345643847L, 400, 2, 2016, 12, 2, "Hyatt", "Kyiv"));
        roomsSet.add(new Room(3281946375L, 300, 1, 2016, 12, 1, "Hilton", "Kyiv"));
        this.setRooms(roomsSet);
    }

}
