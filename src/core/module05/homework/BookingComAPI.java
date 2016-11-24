package core.module05.homework;

public class BookingComAPI extends APIAbstract {
    public BookingComAPI() {
        Room[] roomsSet = new Room[5];
        roomsSet[0] = new Room(4567483745L, 150, 2, 2016, 12, 15, "Hilton", "Kyiv");
        roomsSet[1] = new Room(4567446375L, 500, 1, 2016, 12, 4, "Hilton", "Kyiv");
        roomsSet[2] = new Room(1256446375L, 500, 1, 2016, 12, 3, "Hyatt", "Kyiv");
        roomsSet[3] = new Room(2345643847L, 400, 2, 2016, 12, 2, "Hyatt", "Kyiv");
        roomsSet[4] = new Room(3281946375L, 300, 1, 2016, 12, 1, "Hilton", "Kyiv");
        this.rooms = roomsSet;
    }

    public void setRooms(Room[] rooms) {
        this.rooms = rooms;
    }

}
