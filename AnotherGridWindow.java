import javax.swing.*;
import java.awt.*;

public class AnotherGridWindow extends JFrame {

    private final int WINDOW_WIDTH = 400;
    private final int WINDOW_HEIGHT = 200;

    public AnotherGridWindow() {
        // Set the title bar text
        setTitle("Another Grid Layout");

        // Set the size
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

        // Set what happens when window closes
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set the layout
        setLayout(new GridLayout(2, 3));

        // Create the buttons
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");
        JButton button4 = new JButton("Button 4");
        JButton button5 = new JButton("Button 5");
        JButton button6 = new JButton("Button 6");

        // Add the six buttons to the content pane
        add(button1);
        add(button2);
        add(button3);
        add(button4);
        add(button5);
        add(button6);

        // Display the window
        setVisible(true);

    }

    public static void main(String[] args) {
        new AnotherGridWindow();

    }

}
