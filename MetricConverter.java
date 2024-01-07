import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class MetricConverter extends JFrame {

    private JPanel panel; // A holding panel
    private JLabel messageLabel; // A message to the user
    private JTextField kiloTextField; // To hold the user input
    private JRadioButton milesButton; // To convert to miles
    private JRadioButton feetButton; // To convert to feet
    private JRadioButton inchesButton; // To convert to inches
    private ButtonGroup radioButtonGroup; // To group radio buttons
    private final int WINDOW_HEIGHT = 200; // Window height
    private final int WINDOW_WIDTH = 500; // Window width

    public MetricConverter() {

        // Set the title
        setTitle("Metric Converter");

        // Set the size of the window
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        buildPanel();

        add(panel);

        setVisible(true);
    }

    private void buildPanel() {
        // Create the label, text field, and radio buttons.
        messageLabel = new JLabel("Enter a distance in kilometers ");

        kiloTextField = new JTextField(10);

        milesButton = new JRadioButton("Convert to miles");

        feetButton = new JRadioButton("Convert to feet");

        inchesButton = new JRadioButton("Convert to inches");

        // Group the radio buttons
        radioButtonGroup = new ButtonGroup();
        radioButtonGroup.add(milesButton);
        radioButtonGroup.add(feetButton);
        radioButtonGroup.add(inchesButton);

        // Action to the radio buttons
        milesButton.addActionListener(new RadioButtonListener());
        feetButton.addActionListener(new RadioButtonListener());
        inchesButton.addActionListener(new RadioButtonListener());

        // Create a panel andd add the omponents to it
        panel = new JPanel();
        panel.add(messageLabel);
        panel.add(kiloTextField);
        panel.add(milesButton);
        panel.add(feetButton);
        panel.add(inchesButton);
    }

    private class RadioButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String input; // To hold the user's input
            String convertTo = " "; // The units we are converting
            double result = 0.0; // To hold the conversion

            // Get the kilometers entered
            input = kiloTextField.getText();

            // Determine which radio button was clicked
            if (e.getSource() == milesButton) {
                // Convert to miles
                convertTo = " miles.";
                result = Double.parseDouble(input) * 0.6214;
            } else if (e.getSource() == feetButton) {
                // Convert to feet
                convertTo = " feet.";
                result = Double.parseDouble(input) * 3281.0;
            } else if (e.getSource() == inchesButton) {
                // Convert to inches
                convertTo = " inches.";
                result = Double.parseDouble(input) * 39370.0;
            }

            // Display the conversion
            JOptionPane.showMessageDialog(null, input + " kilometers is " + result + convertTo);

        }

    }

    public static void main(String[] args) {
        new MetricConverter();
        // Main method
    }
}
