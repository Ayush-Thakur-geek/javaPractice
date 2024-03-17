package EndSem;

import javax.swing.*;
import java.sql.*;
import java.util.Collections;

public class DB {
    public static Connection connection;
    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db?useSSL=false", "root", "Thakur@7");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Connected...");
        return connection;
    }

    public static void main(String[] args) {
        DB.getConnection();
    }
}
class Login {

    public static void enter(String employee_id, String department) throws SQLException {
        Connection connection = DB.getConnection();
        PreparedStatement ps = connection.prepareStatement(
                "Select * from tbl_employee where employee_id='"+employee_id+"' and department='"+department+"'");
        ResultSet rs = ps.executeQuery();

    }
}