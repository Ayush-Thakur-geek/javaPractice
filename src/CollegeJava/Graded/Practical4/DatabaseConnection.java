package CollegeJava.Graded.Practical4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    public static Connection connection;
    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/Practical4?useSSL=false",
                    "root", "Thakur@7");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Connected to DataBase successfully!");
        return connection;
    }
    public static void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        DatabaseConnection.getConnection();
    }
}
