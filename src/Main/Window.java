package Main;

import javax.swing.JFrame;
public class Window extends JFrame {

    public Window () {
        setTitle("Tu gfa");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(new GamePanel(1920,1080));
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

}
