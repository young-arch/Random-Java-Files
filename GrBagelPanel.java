import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

/**
 * The BagelPanel class allows the user to select either
 * a white or whole wheat bagel
 */
public class GrBagelPanel extends JPanel {
    // The following constants are used to indicate the cost of each type of bagel.

    public final double WHITE_BAGEL = 1.25;
    public final double WHEAT_BAGEL = 1.50;

    private JRadioButton whiteBagel; // To select white
    private JRadioButton wheatBagel; // To select wheat

    private ButtonGroup bg;

    /*
     * Constructor
     */

    public GrBagelPanel() {
        // Create a GridLayout manager with two rows and one column
        setLayout(new GridLayout(2, 1));

        // Create the radio buttons
        whiteBagel = new JRadioButton("White", true);
        wheatBagel = new JRadioButton("Wheat");

        // Group the radio buttons
        bg = new ButtonGroup();
        bg.add(wheatBagel);
        bg.add(whiteBagel);

        // Add a border around the panel
        setBorder(BorderFactory.createTitledBorder("Bagel"));

        // Add the radio buttons to the panel
        add(whiteBagel);
        add(wheatBagel);

    }

    /**
     * getToppingCost methos
     * 
     * @return The cost of the selected toppings
     */
    public double getBagelCost() {

        double bagelCost = 0.0;

        if (whiteBagel.isSelected()) {
            bagelCost = WHITE_BAGEL;
        } else {
            bagelCost = WHEAT_BAGEL;
        }

        return bagelCost;
    }

}
