import javax.swing.*;

public class GameFrame extends JFrame {
    GameFrame() {
//        GamePanel panel = new GamePanel();
        //or
        this.add(new GamePanel());
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);

    }
}
