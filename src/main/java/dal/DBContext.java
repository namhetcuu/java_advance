package dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBContext {
	public static Connection connection;

    public static void ketnoi() {
        try {
            // Ensure MySQL driver is loaded
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/rap_chieu_phim?useSSL=false&serverTimezone=UTC";
            String user = "root";
            String password = "123456";
            connection = DriverManager.getConnection(url, user, password);

            if (connection != null) {
                System.out.println("Connection successful");
            } else {
                System.out.println("Failed to establish connection.");
            }
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println("Connection error: " + ex);
        }
    }
}
