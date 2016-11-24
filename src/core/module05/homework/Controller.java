package core.module05.homework;

public class Controller {
    API[] apis = new API[3];

    Controller() {
        this.apis[0] = new BookingComAPI();
        this.apis[1] = new GoogleAPI();
        this.apis[2] = new TripAdvisorAPI();
    }

    Room[] requstRooms(int price, int persons, String city, String hotel) {
        Room[] roomsRequested = new Room[15];
        API[] dbAPI = getApis();
        int searchCounter = 0;
        for (int i = 0; i < dbAPI.length; i++) {
            API api = dbAPI[i];
            Room[] roomsSearchAPIResult = api.findRooms(price, persons, city, hotel);
            for (int j = 0; j < roomsSearchAPIResult.length; j++) {
                roomsRequested[searchCounter] = roomsSearchAPIResult[j];
                searchCounter++;
            }
        }
        return roomsRequested;
    }

    Room[] check(API api1, API api2) {
        Room[] roomsDB = new Room[5];
        Room[] roomsAPI1 = api1.getRooms();
        Room[] result;
        int searchCounter = 0;
        for (Room aRoomsAPI1 : roomsAPI1) {
            result = api2.findRooms(aRoomsAPI1.getPrice(), aRoomsAPI1.getPersons(), aRoomsAPI1.getCityName(), aRoomsAPI1.getHotelName());
            for (int i = 0; i < result.length; i++) {
                if (result[i] != null) {
                    roomsDB[searchCounter] = result[i];
                    searchCounter++;
                }
            }
        }
        return roomsDB;
    }

    public API[] getApis() {
        return apis;
    }
}
