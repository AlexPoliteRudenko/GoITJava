package core.module07.homework.Task4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class DAOImpl implements DAO {
    private List<Room> db = new ArrayList<>();

    @Override
    public Room save(Room room) {
        System.out.print("save room ");
        getDb().add(room);
        return room;
    }

    @Override
    public boolean delete(Room room) {
        System.out.println("delete room");
        Iterator<Room> iter = getDb().iterator();
        boolean isFound = false;
        while (iter.hasNext()) {
            Room roomIter = iter.next();
            if (roomIter.equals(room)) {
                iter.remove();
                isFound = true;
            }
        }
        return isFound;
    }

    @Override
    public Room update(Room room) {
        System.out.println("update room");
        ListIterator<Room> iter = getDb().listIterator();
        while (iter.hasNext()) {
            Room roomIter = iter.next();
            if (roomIter.getId() == room.getId() && !roomIter.equals(room)) {
                iter.set(room);
                return room;
            }
        }
        return null;
    }

    @Override
    public Room findById(long id) {
        System.out.println("findByID id" + id);
        for (Room room : getDb()) {
            if (room.getId() == id) {
                return room;
            }
        }
        return null;
    }

    public List<Room> getDb() {
        return db;
    }

    public void setDb(List<Room> db) {
        this.db = db;
    }

    @Override
    public List<Room> getAll() {
        return db;
    }
}
