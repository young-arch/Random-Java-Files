import javax.swing.*; //Needed for Swing classes
import java.awt.*;

public class GridWindow extends JFrame {

    private final int WINDOW_WIDTH = 600;
    private final int WINDOW_HEIGHT = 400;

    public GridWindow() {

        setTitle("Grid Laout");

        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Add a GridLayout to the content pane
        setLayout(new GridLayout(2, 3));

        // Create six buttons.
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");
        JButton button4 = new JButton("Button 4");
        JButton button5 = new JButton("Button 5");
        JButton button6 = new JButton("Button 6");

        // Add the six buttons to the content pane
        add(button1); // Goes into row 1, coloumn 1
        add(button2);
        add(button3);
        add(button4);
        add(button5);
        add(button6);

        // Display the window
        setVisible(true);

    }

    public static void main(String[] args) {
        new GridWindow();
    }

}
