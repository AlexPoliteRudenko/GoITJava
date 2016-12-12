package core.module07.homework.Task4;

import java.util.ArrayList;
import java.util.List;

public abstract class APIAbstract implements API {
    private List<Room> rooms;

    @Override
    public List<Room> findRooms(int price, int persons, String city, String hotel) {
        List<Room> roomsFound = new ArrayList<>();
        List<Room> apiRooms = getRooms();

        for (Room apiRoom : apiRooms) {
            if (price == apiRoom.getPrice() && persons == apiRoom.getPersons() &&
                    city.equals(apiRoom.getCityName()) && hotel.equals(apiRoom.getHotelName())) {
                roomsFound.add(apiRoom);
            }
        }
        return roomsFound;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    public List<Room> getRooms() {
        return rooms;
    }
}
