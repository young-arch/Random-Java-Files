import javax.swing.*;
import java.awt.*;

/**
 * The ToppingPanel class allows the user to select the
 * toppings for the bagel
 */

public class GrToppingPanel extends JPanel {

    // The following constants are used to indicate the cost of Toppings
    public final double CREAM_CHEESE = 0.50;
    public final double BUTTER = 0.25;
    public final double PEACH_JELLY = 0.75;
    public final double BLUEBERRY_JAM = 0.75;

    private JCheckBox creamCheese; // To select cream cheese
    private JCheckBox butter; // To select butter
    private JCheckBox peachJelly; // To select peach jelly
    private JCheckBox blueberryJam; // To select the blueberry jam

    /*
     * Constructor
     */

    public GrToppingPanel() {
        // Create a GridLayout manager with four rows and a column
        setLayout(new GridLayout(4, 1));

        // Create the check boxes.
        creamCheese = new JCheckBox("Cream Cheese");
        butter = new JCheckBox("Butter");
        peachJelly = new JCheckBox("Peach Jelly");
        blueberryJam = new JCheckBox("BlueBerry jam");

        // Add a border around the panel
        setBorder(BorderFactory.createTitledBorder("Toppings"));

        // Add the check boxes to the panel
        add(creamCheese);
        add(butter);
        add(peachJelly);
        add(blueberryJam);

    }

    /**
     * getToppingsCost method
     * 
     * @return The cost of the selected toppings
     */
    public double getToppingCost() {
        double toppingCost = 0.0;

        if (creamCheese.isSelected()) {
            toppingCost += CREAM_CHEESE;
        }
        if (butter.isSelected()) {
            toppingCost += BUTTER;
        }
        if (butter.isSelected()) {
            toppingCost += PEACH_JELLY;
        }
        if (blueberryJam.isSelected()) {
            toppingCost += BLUEBERRY_JAM;
        }
        return toppingCost;
    }

}
