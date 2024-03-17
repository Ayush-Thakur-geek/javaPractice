package gui;

import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class Login {
    JFrame f;
    JLabel l1, l2, l3, l4;
    JButton b1;
    JPasswordField pf;
    JTextField tf;
    Login () {
        Connection connection = DB.getConnection();
        f = new JFrame("Login Account");
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setBounds(100, 100, 580, 350);
        f.setBackground(Color.BLACK);
        f.setLocation(750, 450);
        f.setLayout(null);

        l1 = new JLabel("UserName");
        l1.setBounds(120, 120, 150, 30);
        l1.setForeground(Color.BLACK);
        f.add(l1);

        l2 = new JLabel("Password");
        l2.setBounds(120, 170, 150, 30);
        l2.setForeground(Color.BLACK);
        f.add(l2);

        tf = new JTextField();
        tf.setBounds(320, 120, 150, 30);
        f.add(tf);

        pf = new JPasswordField();
        pf.setBounds(320, 170, 150, 30);
        f.add(pf);

        b1 = new JButton("Submit");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(120, 220, 150, 40);
        f.add(b1);

        b1.addActionListener(e -> {
            String name = tf.getText();
            String pass = pf.getText();
            if (name != null || pass != null) {
                try {
                    PreparedStatement ps = connection.prepareStatement("insert into users values(DEFAULT, ?, ?)");
                    ps.setString(1, name);
                    ps.setString(2, pass);
                    ps.executeUpdate();
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Please enter username and password");
            }
        });
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new Login();
    }
}
