import javax.swing.*; //Needed for Swing classes 
import java.awt.*; //Needed for Color class
import java.awt.event.*; //Needed for event listener interface

public class ColorWindow extends JFrame {

    private JLabel messageLabel;
    private JButton redButton;
    private JButton blueButton;
    private JButton yellButton;
    private JPanel panel;
    private final int WINDOW_WIDTH = 300;
    private final int WINDOW_HEIGHT = 225;

    /**
     * Constructor
     */

    private ColorWindow() {
        // Set the title bar text.
        setTitle("Our Colors");

        // Set the size of the window
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

        // Specify an action for the close button
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a label
        messageLabel = new JLabel("Click a button to select a color.");

        // Create the three buttons
        redButton = new JButton("Red");
        blueButton = new JButton("Blue");
        yellButton = new JButton("Yellow");

        // Register an event listener with all 3 buttons.
        redButton.addActionListener(new RedButtonListener());
        blueButton.addActionListener(new BlueButtonListener());
        yellButton.addActionListener(new yellButtonListener());

        // Create a panel and add the componenets to it
        panel = new JPanel();

        panel.add(messageLabel);
        panel.add(redButton);
        panel.add(blueButton);
        panel.add(yellButton);

        // Add the panel to the content pane.
        add(panel);

        // Display the window
        setVisible(true);

    }

    /**
     * Private inner class that handles the event when
     * the user clicks the Red button.
     */

    private class RedButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            // Set the panel's background to red
            panel.setBackground(Color.RED);

            // Set the label's text to blue
            messageLabel.setForeground(Color.BLUE);
        }
    }

    private class BlueButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            // Set the panel's background to blue
            panel.setBackground(Color.BLUE);

            // Set the label's text to yellow
            messageLabel.setForeground(Color.BLACK);
        }
    }

    private class yellButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            // Set the panel's background to yellow.
            panel.setBackground(Color.YELLOW);

            // Set the label's text to black.
            messageLabel.setForeground(Color.BLACK);
        }
    }

    public static void main(String[] args) {
        new ColorWindow();
    }
}
