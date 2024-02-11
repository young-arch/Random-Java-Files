import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ColorCheckBoxWindow extends JFrame {

    private JLabel messagLabel;
    private JCheckBox yellowCheckBox;
    private JCheckBox redCheckBox;
    private final int WINDOW_HEIGHT = 200;
    private final int WINDOW_WIDTH = 400;

    public ColorCheckBoxWindow() {

        // Set the text for the title bar
        setTitle("Color Check Boxes");

        // Set the size
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

        // Specify an action for the close button
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a Label
        messagLabel = new JLabel("Select the Check boxes to change colors.");

        // Create the check boxes
        redCheckBox = new JCheckBox("Red foreground");
        yellowCheckBox = new JCheckBox("Yellow background");

        // Add an item listener to the check boxes
        yellowCheckBox.addItemListener(new CheckBoxListener());
        redCheckBox.addItemListener(new CheckBoxListener());

        // Add a FlowLayout manager to the content's pane
        setLayout(new FlowLayout());

        // Add the label and check boxes to the content pane.
        add(messagLabel);
        add(redCheckBox);
        add(yellowCheckBox);

        // Display the window
        setVisible(true);
    }

    private class CheckBoxListener implements ItemListener {

        public void itemStateChanged(ItemEvent e) {
            // Determine which check box was clicked
            if (e.getSource() == yellowCheckBox) {
                // Is the yellow check box selected? if so we want to set the background color
                // to yellow
                if (yellowCheckBox.isSelected()) {
                    // The yellow box was selected. Set the background color for the content pane to
                    // yellow
                    getContentPane().setBackground(Color.YELLOW);
                    yellowCheckBox.setBackground(Color.YELLOW);
                    redCheckBox.setBackground(Color.YELLOW);
                } else {
                    // The yellow check box was deselected. Set the
                    // background color for the content pane and the two check boxes to light gray.
                    getContentPane().setBackground(Color.LIGHT_GRAY);
                    yellowCheckBox.setBackground(Color.LIGHT_GRAY);
                    redCheckBox.setBackground(Color.LIGHT_GRAY);
                }
            } else if (e.getSource() == redCheckBox) {
                // Is the red box selected? If so, we want to set the foreground color to red.
                if (redCheckBox.isSelected()) {
                    // The red chek box was Selected. Set the foreground color for the label
                    // and two check boxes to black
                    messagLabel.setForeground(Color.RED);
                    yellowCheckBox.setForeground(Color.RED);
                    redCheckBox.setForeground(Color.RED);
                } else {
                    // The red check box was deselcted. Set the foreground color
                    // for the label and the two check boxes to black

                    messagLabel.setForeground(Color.BLACK);
                    yellowCheckBox.setForeground(Color.BLACK);
                    redCheckBox.setForeground(Color.BLACK);
                }
            }
        }
    }

    public static void main(String[] args) {
        new ColorCheckBoxWindow();
    }
}
