package assessment4;

import java.sql.Connection;
import java.sql.DriverManager;

public class dbconnection {
    public static final String URL = "jdbc:mysql://localhost:3306/expleo_assmt_4";
    public static final String USER = "root";
    public static final String PASSWORD = "shingekinokyojin@4";

    public static Connection getConnection() throws Exception {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}