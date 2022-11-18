
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    private static final String url = "jdbc:mysql://localhost:3306/db5lab";
    private static final String user = "root";
    private static final String password = "24101979";

    private static Connection con;
    private static Statement stmt;
    private static ResultSet rs;

    public static void main(String args[]) {
        String username = "root";
        String password = "24101979";
        System.out.println("Connecting database...");

        try
        {
            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("Database connected!");

        } catch (SQLException e) {
            throw new IllegalStateException("Cannot connect the database!", e);
        }

    }

}