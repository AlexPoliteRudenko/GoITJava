package core.module07.homework.Task4;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private List<API> apis = new ArrayList<>();
    private DAOImpl dataBase = new DAOImpl();

    Controller() {
        this.apis.add(new BookingComAPI());
        this.apis.add(new GoogleAPI());
        this.apis.add(new TripAdvisorAPI());
    }

    List<Room> requstRooms(int price, int persons, String city, String hotel) {
        List<Room> roomsRequested = new ArrayList<>();
        List<API> dbAPI = getApis();
        for (API api : dbAPI) {
            List<Room> roomsSearchAPIResult = api.findRooms(price, persons, city, hotel);
            for (Room room : roomsSearchAPIResult) {
                roomsRequested.add(room);
            }
        }
        return roomsRequested;
    }

    List<Room> check(API api1, API api2) {
        List<Room> roomsDB = new ArrayList<>();
        List<Room> roomsAPI1 = api1.getRooms();
        List<Room> result;
        for (Room aRoomsAPI1 : roomsAPI1) {
            result = api2.findRooms(aRoomsAPI1.getPrice(), aRoomsAPI1.getPersons(), aRoomsAPI1.getCityName(), aRoomsAPI1.getHotelName());
            for (Room room : result) {
                roomsDB.add(room);
            }
        }
        return roomsDB;
    }

    Room save(Room room) {

        return dataBase.save(room);
    }

    boolean delete(Room room) {

        return dataBase.delete(room);
    }

    Room update(Room room) {

        return dataBase.update(room);
    }

    Room findById(long id) {

        return dataBase.findById(id);
    }

    public DAOImpl getDataBase() {
        return dataBase;
    }

    public void setDataBase(DAOImpl dataBase) {
        this.dataBase = dataBase;
    }

    public List<API> getApis() {
        return apis;
    }
}
