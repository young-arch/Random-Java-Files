import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * This class demonstrates how to use an ImageIcon and a JLabel
 * to display an image
 */

public class MyCatImage extends JFrame {

    private JPanel imagePanel;
    private JPanel buttonPanel;
    private JLabel imageLabel;
    private JButton button;

    /**
     * Constructor
     */

    public MyCatImage() {

        setTitle("My Cat");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new BorderLayout());

        // Build the panels
        buildImagePanel();
        buildButtonPanel();

        // Add the panels to the content panel

        add(imagePanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        // Pack and display the window
        pack();
        setVisible(true);
    }

    private void buildImagePanel() {
        // Create a panel
        imagePanel = new JPanel();

        // Create a label
        imageLabel = new JLabel("Click button to see an image of my cat. ");

        // Add the label to the panel
        imagePanel.add(imageLabel);

    }

    private void buildButtonPanel() {
        ImageIcon smileyImage;

        // Create a panel
        buttonPanel = new JPanel();

        // Get the smiley face image
        smileyImage = new ImageIcon("smiley");

        // Create a button
        button = new JButton("Get Image");
        button.setIcon(smileyImage);
        button.setToolTipText("A cat appears when clicked");

        // Register an action Listener with the button
        button.addActionListener(new ButtonListener());

        buttonPanel.add(button);

        Color selectedColor = JColorChooser.showDialog(null, "Select a color", Color.BLUE);
        buttonPanel.setBackground(selectedColor);
    }

    private class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            // Read the image file into an ImageIcon object
            ImageIcon catImage = new ImageIcon("cat.jpg");

            // Display the image in the label
            imageLabel.setIcon(catImage);

            // Remove the text from the label
            imageLabel.setText(null);

            // Pack the frme again to accommodate the new size of the label
            pack();
        }
    }

    public static void main(String[] args) {
        new MyCatImage();
    }
}
