import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/*
 * This class demonstrates the List component in multiple interval
 * selection mode
 */

public class MultipleIntervalSelection extends JFrame {

    private JPanel monthPanel;
    private JPanel selectedMonthPanel;
    private JPanel buttonPanel;
    private JList monthList;
    private JList selectedMonthList;
    private JScrollPane scrollPane;
    private JScrollPane scrollPane2;
    private JButton button;
    private String[] months = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
            "October", "November", "December" };

    public MultipleIntervalSelection() {
        // Set the Title
        setTitle("List Demo");

        // Specify an action for the close button
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Add a BorderLayout manager
        setLayout(new BorderLayout());

        // Build the panels
        buildMonthPanel();
        buildselectedMonthList();
        buildMonthPanel();

        add(monthPanel, BorderLayout.NORTH);
        add(selectedMonthPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        //Pack and display the window
        pack();
        setVisible(true);

    }

    private void buildMonthPanel() {
        // Create a panel to hold the list
        monthPanel = new JPanel();

        // Create the list
        monthList = new JList(months);

        // Set the selection mode to multiple interval selection
        monthList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        // Set the number of visible rows to 6
        monthList.setVisibleRowCount(6);

        // Add the list to a scroll pane
        scrollPane = new JScrollPane(monthList);

        // Add the ScrollPane to the panel
        monthPanel.add(scrollPane);
    }

    private void buildselectedMonthList() {
        // Create a panel to hold the list
        selectedMonthPanel = new JPanel();

        // Create the list
        selectedMonthList = new JList();

        // Set the number of visible rows to 6
        selectedMonthList.setVisibleRowCount(6);

        // Add the list to scroll pane
        scrollPane2 = new JScrollPane(selectedMonthList);

        // Add the scroll pane to the panel
        selectedMonthPanel.add(scrollPane2);

    }

    private void buildButtonPanel() {

        // Create a panel to hold the list
        buttonPanel = new JPanel();

        // Creaate the button
        button = new JButton("Get Selections");

        button.addActionListener(new ButtonListener());

        buttonPanel.add(button);
    }

    private class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            Object[] selections = monthList.getSelectedValues();

            // Store the selected items inselectedMonthList.
            selectedMonthList.setListData(selections);
        }
    }

    /**
     * The main method creates an instance of the MultipleIntervalSelection class
     * which causes it to display its window
     */

    public static void main(String[] args) {

        new MultipleIntervalSelection();
    }

}
