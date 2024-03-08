import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class TempConverter extends JFrame {

    private JLabel label1, label2; // Message labels
    private JTextField fahrenheitTemp; // FahrenheitTemp
    private JTextField celsiusTemp; // Celsius temp
    private JPanel fPanel; // fahrenheit panel
    private JPanel cPanel; // celsius panel
    private JPanel sliderPanel; // Slider pane
    private JSlider slider; // Temperature adjuster

    /*
     * Constructor
     */

    public TempConverter() {
        // Set the title
        setTitle("Temperatures");

        // Specify an action for the close button
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // create the message labels
        label1 = new JLabel("Fahrenheit");
        label2 = new JLabel("Celcius");

        // Create the read-only text fields
        fahrenheitTemp = new JTextField("32.0", 10);
        fahrenheitTemp.setEditable(false);
        celsiusTemp = new JTextField("0.0", 10);
        celsiusTemp.setEditable(false);

        // Create the slider
        slider = new JSlider(JSlider.HORIZONTAL, 0, 100, 0);
        slider.setMajorTickSpacing(20); // Major tick every 20
        slider.setMinorTickSpacing(DISPOSE_ON_CLOSE); // Minor tick every 5
        slider.setPaintTicks(true); // Display tick marks
        slider.setPaintLabels(true); // Display numbers

        slider.addChangeListener(new SliderListener());

        // Create panels and place the componenets in them
        fPanel = new JPanel();
        fPanel.add(label1);
        fPanel.add(fahrenheitTemp);

        cPanel = new JPanel();
        cPanel.add(label2);
        cPanel.add(celsiusTemp);

        sliderPanel = new JPanel();
        sliderPanel.add(slider);

        // Create a GridLayout manager
        setLayout(new GridLayout(3, 1));

        // Add the panels to the content pane
        add(fPanel);
        add(cPanel);
        add(sliderPanel);

        // Pack and display the frame
        pack();
        setVisible(true);
    }

    private class SliderListener implements ChangeListener {
        public void stateChanged(ChangeEvent e) {

            double fahrenheit, celsius;

            // Get the slider value
            celsius = slider.getValue();

            // Get the slider value to Fahrenheit
            fahrenheit = (9.0 / 5.0) * celsius + 32.0;

            // Store the celcius temp in its display field
            celsiusTemp.setText(Double.toString(celsius));

            // Store the fahrenheit temp in its display field
            fahrenheitTemp.setText(String.format("%.1f", fahrenheit));

        }
    }

    public static void main(String[] args) {
        new TempConverter();
    }

}
