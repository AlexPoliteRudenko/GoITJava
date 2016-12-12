package core.module07.homework.Task4;

import java.util.List;

public interface API {
    List<Room> findRooms(int price, int persons, String city, String hotel);
    public List<Room> getRooms();
}
