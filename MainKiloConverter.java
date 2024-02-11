import javax.swing.*; //Needed for Swing classes 

import java.awt.event.*; //Needed for ActionListener Interface 

public class MainKiloConverter extends JFrame {
    private JPanel panel; // To reference a panel
    private JLabel messageLabel; // To reference a label
    private JTextField kiloTextField; // To reference a text field
    private JButton calcButton; // To reference a button
    private final int WINDOW_WIDTH = 410; // Window Width
    private final int WINDOW_HEIGHT = 200; // Window height

    /**
     * Constructor
     */

    public MainKiloConverter() {
        // Set the window title
        setTitle("Kilometer Converter");

        // Set the size of the window
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

        // Specify what happens when the close button is clicked.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Build the panel
        buildPanel();

        // Add the panel to the frame's content pane
        add(panel);

        // Display the window
        setVisible(true);
    }

    /**
     * The build panel method adds a label, a text field, and a button to a panel.
     */

    public void buildPanel() {
        // Create a label to display instructions
        messageLabel = new JLabel("Enter a distance in kilometers");

        // Create a text field 10 characters wide
        kiloTextField = new JTextField(10);

        // Create a button with the caption "Calculate".
        calcButton = new JButton("Calculate");

        // Add an action Listener to the button
        calcButton.addActionListener(new CalcButtonListener());

        // Create a JPanel object and let the panel field reference it
        panel = new JPanel();

        panel.add(messageLabel);
        panel.add(kiloTextField);
        panel.add(calcButton);

    }

    /**
     * CalcButtonListener is an listener class for the Calculate button
     */

    private class CalcButtonListener implements ActionListener {
        /**
         * The actionPerformed method executes when the user clicks on the Calculate
         * button.
         * 
         * @param e The object
         */

        public void actionPerformed(ActionEvent e) {
            final double CONVERSION = 0.6214;
            String input; // To hold the user's input
            double miles; // The number of miles

            // Get the text entered by the user into the text field
            input = kiloTextField.getText();

            // Convert the input to miles
            miles = Double.parseDouble(input) * CONVERSION;

            // Display the result.
            JOptionPane.showMessageDialog(null, input + " Kilometers is " + miles + " miles.");
        }
    }

    public static void main(String[] args) {
        new KiloConverter();
    }
}
