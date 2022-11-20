

import java.sql.*;
public class DBConnect
{

    private final String HOST = "jdbc:mysql://localhost:3306/db5lab";
    private final String USERNAME = "root";
    private final String PASSWORD = "24101979";


    public Connection getConnection() {
        return connection;
    }

    private Connection connection;

    public DBConnect(Connection connection) {
        this.connection = connection;
    }

    public DBConnect()
    {
        try {
            connection = DriverManager.getConnection(HOST,USERNAME,PASSWORD);
            System.out.println("Подключение к БД прошло успешно.");
        } catch (SQLException e)
        {
            e.printStackTrace();
        }


    }

}
