import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ComboBoxWindow extends JFrame {

    private JPanel coffeePanel;
    private JPanel selectedCoffeePanel;
    private JComboBox coffeeBox;
    private JLabel label;
    private JTextField selectedCoffee;

    // The following array holds the values that will be displayed
    // in the coffeeBox combo box
    private String[] coffee = { "Regular Coffee", "Dark Roast", "Cappuchino", "Espresso", "Decaf" };

    /**
     * Constructor
     */

    public ComboBoxWindow() {

        setTitle("Combo Box Demo");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new BorderLayout());

        buildCoffeePanel();
        buildSelectedCoffeePanel();

        add(coffeePanel, BorderLayout.CENTER);
        add(selectedCoffeePanel, BorderLayout.SOUTH);

        // Pack and display the window
        pack();
        setVisible(true);

    }

    private void buildCoffeePanel(){
        //Create a panel to hold the combo box
        coffeePanel = new JPanel();

        //Create the combo box
        coffeeBox = new JComboBox(coffee);

        //Register an action Listener 
        coffeeBox.addActionListener(new ComboBoxListener());

        //Add the combo box to the panel
        coffeePanel.add(coffeeBox);
     }

    private void buildSelectedCoffeePanel() {
        // Create a panel to hold the componenets
        selectedCoffeePanel = new JPanel();

        label = new JLabel("You Selected: ");

        // Create the uneditable text field
        selectedCoffee = new JTextField(10);
        selectedCoffee.setEditable(false);

        // Add the label and text field to the panel
        selectedCoffeePanel.add(label);
        selectedCoffeePanel.add(selectedCoffee);

    }

    private class ComboBoxListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String selection = (String) coffeeBox.getSelectedItem();

            // Display the selected coffee in the text field
            selectedCoffee.setText(selection);
        }
    }

    public static void main(String[] args) {
        new ComboBoxWindow();
    }
}
