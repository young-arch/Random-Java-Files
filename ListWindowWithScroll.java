import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class ListWindowWithScroll extends JFrame {

    private JPanel monthPanel;
    private JPanel selectedMonthPanel;
    private JList monthList;
    private JScrollPane scrollPane;
    private JTextField selectedMonth;
    private JLabel label;

    private String[] months = { "January", "February", "March", "April", "May", "June", "July", "August",
            "September", "October", "November", "December" };

    public ListWindowWithScroll() {
        // Set the Title
        setTitle("List Demo");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new BorderLayout());

        buildMonthPanel();
        buildSelectedMonthPanel();

        add(selectedMonthPanel, BorderLayout.SOUTH);

        add(monthPanel, BorderLayout.CENTER);

        // Pack and displaythe window
        pack();
        setVisible(true);

    }

    private void buildMonthPanel() {
        // Create a panel to hold the list
        monthPanel = new JPanel();

        monthList = new JList(months);

        monthList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        monthList.addListSelectionListener(new ListListener());

        // Set the visible rows to 6
        monthList.setVisibleRowCount(6);

        // Add the list to the scroll pane
        JScrollPane scrollPane = new JScrollPane(monthList);

        monthPanel.add(scrollPane);
    }

    private void buildSelectedMonthPanel() {

        // Create a panel to hold the objects
        selectedMonthPanel = new JPanel();

        // Create the label
        label = new JLabel("You selected: ");

        // Create the textField
        selectedMonth = new JTextField();

        selectedMonth.setEditable(false);

        // Add them to the panel
        selectedMonthPanel.add(selectedMonth);
        selectedMonthPanel.add(label);
    }

    private class ListListener implements ListSelectionListener {

        public void valueChanged(ListSelectionEvent e) {

            // Get the selected month
            String selection = (String) monthList.getSelectedValue();

            // Put the selected month in the text field
            selectedMonth.setText("You selected " + selection);

        }
    }

    public static void main(String[] args) {
        new ListWindowWithScroll();
    }
}
