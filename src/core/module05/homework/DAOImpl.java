package core.module05.homework;

public class DAOImpl implements DAO {
    Room[] db = new Room[1];

    @Override
    public Room save(Room room) {
        System.out.print("save room ");

        for (int i = 0; i < db.length; i++) {
            if (db[i] == null) {
                db[i] = room;
                break;
            }
            if (i == db.length - 1) {
                Room[] dbTemp = new Room[db.length + 1];
                for (int j = 0; j < db.length; j++) {
                    dbTemp[j] = db[j];
                }
                db = dbTemp;
                db[i + 1] = room;
            }
        }
        return room;
    }

    @Override
    public boolean delete(Room room) {
        System.out.println("delete room");
        boolean isFound = false;
        for (int i = 0; i < db.length; i++) {
            if (db[i].equals(room)) {
                db[i] = null;
                isFound = true;
            }
        }
        return isFound;
    }

    @Override
    public Room update(Room room) {
        System.out.println("update room");
        for (int i = 0; i < db.length; i++) {
            if (db[i].getId() == room.getId() && !db[i].equals(room)) {
                db[i] = room;
            }
        }
        return null;
    }

    @Override
    public Room findById(long id) {
        System.out.println("findByID id" + id);
        for (int i = 0; i < db.length; i++) {
            if (db[i].getId() == id) {
                return db[i];
            }
        }
        return null;
    }

    @Override
    public Room[] getAll() {
        return db;
    }
}
