import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MenuWindow extends JFrame {

    private JLabel messageLabel; // Displays a message
    private final int LABEL_WIDTH = 400; // Label's width
    private final int LABEL_HEIGHT = 200; // Label's height

    // The following refernece the menu components
    private JMenuBar menuBar;
    private JMenu fileMenu;
    private JMenu textMenu;
    private JMenuItem exitItem; // To Exit
    private JRadioButtonMenuItem blackItem; // Makes the text black
    private JRadioButtonMenuItem redItem; // Makes the text red
    private JRadioButtonMenuItem blueItem; // Makes the text blue
    private JCheckBoxMenuItem visibleItem; // Toogle visibilty

    public MenuWindow() {

        setTitle("A Menu Window");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        messageLabel = new JLabel("Use the Text menu to change my color and make me invisble", SwingConstants.CENTER);

        // Set the Label's preferred size
        messageLabel.setPreferredSize(new Dimension(LABEL_WIDTH, LABEL_HEIGHT));

        // Set the Label's foreground color
        messageLabel.setForeground(Color.BLACK);

        // Add the Label's to the content pane
        add(messageLabel);

        // Build the menu bar
        buildMenuBar();

        // Pack and display the window
        pack();
        setVisible(true);

    }

    private void buildMenuBar() {

        menuBar = new JMenuBar();

        // Create the file and text menus
        buildFileMenu();
        buildTextMenu();

        // Add the File and TextMenu to the menu bar
        menuBar.add(fileMenu);
        menuBar.add(textMenu);

        // Set the Window's menu bar
        setJMenuBar(menuBar);
    }

    private void buildFileMenu() {
        fileMenu = new JMenu();
        // Create an Exit menu item
        exitItem = new JMenuItem("Exit");
        exitItem.setMnemonic(KeyEvent.VK_X);
        exitItem.addActionListener(new ExitListener());

        // Create a JMenu object for the File menu
        fileMenu.add(exitItem);

    }

    private void buildTextMenu() {
        textMenu = new JMenu();
        // Create the radio button menu items to change the
        // Color of the text. Add an action listener to each one

        blackItem = new JRadioButtonMenuItem("Black", true);
        blackItem.setMnemonic(KeyEvent.VK_B);
        blackItem.addActionListener(new ColorListener());

        redItem = new JRadioButtonMenuItem("Red");
        redItem.setMnemonic(KeyEvent.VK_R);
        redItem.addActionListener(new ColorListener());

        blueItem = new JRadioButtonMenuItem("Blue");
        blueItem.setMnemonic(KeyEvent.VK_B);
        blueItem.addActionListener(new ColorListener());

        // Create a group for the radio button items
        ButtonGroup group = new ButtonGroup();
        group.add(blackItem);
        group.add(redItem);
        group.add(blueItem);

        // Create a check box menu item to make the text
        // visible or invisble
        visibleItem = new JCheckBoxMenuItem("Visble", true);
        visibleItem.setMnemonic(KeyEvent.VK_V);
        visibleItem.addActionListener(new VisibleListener());

        // Create a JMenu object for the Text menu
        textMenu.add(blackItem);
        textMenu.add(redItem);
        textMenu.add(blueItem);
        textMenu.add(visibleItem);

    }

    /**
     * Private inner class that handles the event that is generated
     * when the user selects Exit from the File menu
     */

    private class ExitListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            System.exit(0);
        }
    }

    /**
     * Private inner class that handles the event that is generated
     * when the user selects a color from the Text menu
     */

    private class ColorListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (blackItem.isSelected()) {
                messageLabel.setForeground(Color.BLACK);
            } else if (redItem.isSelected()) {
                messageLabel.setForeground(Color.RED);
            } else if (blueItem.isSelected()) {
                messageLabel.setForeground(Color.BLUE);
            }
        }
    }

    /*
     * Private inner class that handles the event that is generated
     * when the user selects Visible from the Text Menu
     */

    private class VisibleListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (visibleItem.isSelected()) {
                messageLabel.setVisible(true);
            } else {
                messageLabel.setVisible(false);
            }
        }
    }

    /**
     * The main method creates an instance of the MenuWindow class, which causes it
     * to
     * display its window
     * 
     * @param args
     */

    public static void main(String[] args) {
        new MenuWindow();
    }

}
