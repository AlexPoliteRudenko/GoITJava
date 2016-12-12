package core.module07.homework.Task4;

import java.util.ArrayList;
import java.util.List;

public class TripAdvisorAPI extends APIAbstract {

    public TripAdvisorAPI() {
        List<Room> roomsSet = new ArrayList<>();
        roomsSet.add(new Room(3291874345L, 400, 1, 2016, 12, 20, "Hilton", "Kyiv"));
        roomsSet.add(new Room(4567446375L, 200, 1, 2016, 12, 19, "Hilton", "Kyiv"));
        roomsSet.add(new Room(3988746375L, 600, 2, 2016, 12, 5, "Hilton", "Kyiv"));
        roomsSet.add(new Room(4567449847L, 400, 2, 2016, 12, 2, "Hyatt", "Kyiv"));
        roomsSet.add(new Room(5367946375L, 500, 1, 2016, 12, 1, "Hyatt", "Kyiv"));
        this.setRooms(roomsSet);
    }
}
