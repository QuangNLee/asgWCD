package manager.food.assignment.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionHelper {
    private final static String DATABASE_URL_FORMAT = "jdbc:mysql://%s:%d/%s?useUnicode=true&contentEncoding=UTF-8";
    private final static String DATABASE_SERVER = "localhost:8088";
    private final static int DATABASE_PORT = 3366;
    private final static String DATABASE_NAME = "assignment";
    private final static String DATABASE_USER = "root";
    private final static String DATABASE_PWD = "";

    public static Connection connection;

    public static Connection getConnection() {
        try {
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            if (connection == null || connection.isClosed()) {
                connection = DriverManager.getConnection(
                        String.format(DATABASE_URL_FORMAT, DATABASE_SERVER, DATABASE_PORT, DATABASE_NAME),
                        DATABASE_USER,
                        DATABASE_PWD);
                System.out.println("Create connection success");
            }
        } catch (SQLException e) {
            System.err.println("Can't create connection, message: " + e.getMessage());
        }
        return connection;
    }
}
