package core.module05.homework;

public class TripAdvisorAPI extends APIAbstract {

    public void setRooms(Room[] rooms) {
        this.rooms = rooms;
    }

    public TripAdvisorAPI() {
        Room[] roomsSet = new Room[5];
        roomsSet[0] = new Room(3291874345L, 400, 1, 2016, 12, 20, "Hilton", "Kyiv");
        roomsSet[1] = new Room(4567446375L, 200, 1, 2016, 12, 19, "Hilton", "Kyiv");
        roomsSet[2] = new Room(3988746375L, 600, 2, 2016, 12, 5, "Hilton", "Kyiv");
        roomsSet[3] = new Room(4567449847L, 400, 2, 2016, 12, 2, "Hyatt", "Kyiv");
        roomsSet[4] = new Room(5367946375L, 500, 1, 2016, 12, 1, "Hyatt", "Kyiv");
        this.rooms = roomsSet;
    }
}
