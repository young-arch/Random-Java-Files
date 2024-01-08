import javax.swing.*;

public class EmbeddedMain extends JFrame {

    final int WINDOW_HEIGHT = 350;
    final int WINDOW_WIDTH = 450;

    /**
     * Constructor
     */

    public EmbeddedMain() {

        setTitle("Welcome to Dr. Mawule's Estate ");

        setSize(WIDTH, HEIGHT);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setVisible(true);

    }

    public static void main(String[] args) {
        EmbeddedMain Doc = new EmbeddedMain();
    }
}
