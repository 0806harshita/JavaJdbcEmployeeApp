package JavaJdbcEmployeeApp.src;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/EmployeeDB";
    private static final String USER = "root";
    private static final String PASSWORD = "Harshita@0806";

    public static Connection getConnection() {
        try {
           System.out.println("Connecting to database...");
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded successfully.");
            System.out.println("Establishing connection...");

            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
