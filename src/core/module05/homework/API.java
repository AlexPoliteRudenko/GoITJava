package core.module05.homework;

public interface API {
    public Room[] getRooms();
    Room[] findRooms(int price, int persons, String city, String hotel);
}
