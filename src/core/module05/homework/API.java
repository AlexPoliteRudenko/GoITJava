package core.module05.homework;

public interface API {
    Room[] findRooms(int price, int persons, String city, String hotel);
    public Room[] getRooms();
}
