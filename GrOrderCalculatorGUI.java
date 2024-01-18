import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.beans.JavaBean;

/**
 * The OrderCalculatorGUI class creates the GUI for the
 * Brandi's Bagel House application
 */
public class GrOrderCalculatorGUI extends JFrame {

    private GrBagelPanel bagels; // Bagel panel
    private GrToppingPanel toppings; // Topping panel
    private GrCoffeePanel coffee; // Coffee panel
    private GreetingPanel banner; // To display
    private JPanel buttonPanel; // To hold the buttons
    private JButton calcButton; // To calculate the cost
    private JButton exitButton; // To exit the application
    private final double TAX_RATE = 0.06; // Sales tax rate

    /**
     * Constructor
     */

    public GrOrderCalculatorGUI() {

        // Display a title
        setTitle("Order Calculator");

        // Specify an action for the close button
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a BorderLayout manager
        setLayout(new BorderLayout());

        // Create the custom panels
        banner = new GreetingPanel();
        bagels = new GrBagelPanel();
        toppings = new GrToppingPanel();
        coffee = new GrCoffeePanel();

        // Create the button panel
        buildsButtonPanel();

        // Add the components to the content pane.
        add(banner, BorderLayout.NORTH);
        add(bagels, BorderLayout.WEST);
        add(toppings, BorderLayout.CENTER);
        add(coffee, BorderLayout.EAST);
        add(buttonPanel, BorderLayout.SOUTH);

        // Pack the contents of the window and display it
        pack();
        setVisible(true);
    }

    private void buildsButtonPanel() {
        // Create a panel for the buttons
        buttonPanel = new JPanel();

        // Create the buttons
        calcButton = new JButton("Calculate");
        exitButton = new JButton("Exit");

        // Register the action listeners
        calcButton.addActionListener(new CalcButtonListener());
        exitButton.addActionListener(new ExitButtonListener());

        // Add the buttons to the panel
        buttonPanel.add(calcButton);
        buttonPanel.add(exitButton);
    }

    private class CalcButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            // Variables to hold the subTotal, tax, and total
            double subtotal;
            double tax;
            double total;

            // Calculate the subTotal
            subtotal = bagels.getBagelCost() + toppings.getToppingCost() + coffee.getCoffee();

            // Calculate the sales tax
            tax = subtotal * TAX_RATE;

            // Calculate the total
            total = subtotal + tax;

            // Display the charges
            JOptionPane.showMessageDialog(null,
                    String.format("Subtotal: $%,.2f\n" + "Tax: $%,.2f\n" + "Total: $%,.2f", subtotal, tax, total));

        }
    }

    private class ExitButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }

    /**
     * main method
     */

    public static void main(String[] args) {
        new GrOrderCalculatorGUI();
         java splash : asb.jpg GrOrderCalculatorGUI;
    }
}
