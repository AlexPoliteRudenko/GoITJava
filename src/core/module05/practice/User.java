package core.module05.practice;

public class User {
    private int id;
    private String name;
    private Connection connection = Connection.getInstance();

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

}
