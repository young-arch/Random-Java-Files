import javax.swing.*;
import java.awt.event.*;

/**
 * This class demonstrates how to retrieve the action command from an event
 * object.
 */

public class EventObjectWindow extends JFrame {

    private JButton button1; // Button 1
    private JButton button2; // Button 2
    private JButton button3; // Button 3
    private JPanel panel; // A panel to hold the componenets.
    private final int WINDOW_HEIGHT = 310;
    private final int WINDOW_WIDTH = 80;

    /**
     * Constructor
     */

    public EventObjectWindow() {
        setTitle("Event Object Demonstration.");

        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create the buttons
        button1 = new JButton("Button 1");
        button2 = new JButton("Button 2");
        button3 = new JButton("Button 3");

        // Register an event listener with all 3 buttons.
        button1.addActionListener(new ButtonListener());
        button2.addActionListener(new ButtonListener());
        button3.addActionListener(new ButtonListener());

        // Create a panel and add the buttons to it.
        panel = new JPanel();
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);

        // Add the panel to the content pane.
        add(panel);

        // Display the window.
        setVisible(true);

    }

    private class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            // Get the action command.
            String actionCommand = e.getActionCommand();

            // Determine which button was clicked and display a message
            if (actionCommand.equals("Button 1")) {
                JOptionPane.showMessageDialog(null, "You clicked the first button.");
            } else if (actionCommand.equals("Button 2")) {
                JOptionPane.showMessageDialog(null, "You clicked the second button.");
            } else if (actionCommand.equals("Button 3")) {
                JOptionPane.showMessageDialog(null, "You clicked the third button.");
            }
        }
    }

    /**
     * main method
     */
    public static void main(String[] args) {
        new EventObjectWindow();
    }
}
