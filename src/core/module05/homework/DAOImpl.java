package core.module05.homework;

public class DAOImpl implements DAO {
    @Override
    public Room save(Room room) {
        System.out.println("save room ");
        return null;
    }

    @Override
    public boolean delete(Room room) {
        System.out.println("delete room");
        return false;
    }

    @Override
    public Room update(Room room) {
        System.out.println("update room");
        return null;
    }

    @Override
    public Room findById(long id) {
        System.out.println("findByID id");
        return null;
    }
}
