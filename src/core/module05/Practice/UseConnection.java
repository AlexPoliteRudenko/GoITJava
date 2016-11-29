package core.module05.Practice;

public class UseConnection {
    public static void main(String[] args) {
        User user = new User(1,"Alex");
        user.setConnection(Connection.getInstance());
    }
}
