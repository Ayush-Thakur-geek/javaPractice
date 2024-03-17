package jdbc;

import java.sql.*;

public class DBConnection {
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
        DBConnection.getConnection();
        try {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery("Select * from users");
            while (rs.next())  {
                System.out.println(rs.getDate(1));
            }
            DBConnection.closeConnection();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
