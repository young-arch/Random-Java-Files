import javax.swing.*;

public class SimpleGui extends JFrame {
    // Constructor

    public SimpleGui() {

        final int WINDOW_HEIGHT = 350;
        final int WINDOW_WIDTH = 450;

        // Set the window's title
        setTitle("Welcome to Dr.Mawule's Estate");

        // Set the size of the window
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

        // Specify what happens when the close button is clicked.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Display the Window
        setVisible(true);
    }
}
