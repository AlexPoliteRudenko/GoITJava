package core.module05.Practice;

public class Connection {
    String urlConnetion;
    private static Connection connection;

    public Connection() {
    }

    public static Connection getInstance() {
        if (connection == null) {
            return new Connection();
        }
        return connection;
    }
}
