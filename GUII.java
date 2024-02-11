import javax.swing.*;

public class GUII {
    public static void main(String[] args) {
        final int WINDOW_WIDTH = 450; // Window width in pixels
        final int WINDOW_HEIGHT = 350; // Window height in pixels

        // Create a window
        JFrame window = new JFrame();

        // Set the title
        window.setTitle("A simple Window");

        // Set the size of the window
        window.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

        // Specify what happens when the close button is clicked
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Display the window
        window.setVisible(true);

    }

}
