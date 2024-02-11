import javax.swing.*;//
import java.awt.*; //Needed for the BorderLayout class
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BorderWindow extends JFrame {

    private final int WINDOW_WIDTH = 500;
    private final int WINDOW_HEIGHT = 400;

    public BorderWindow() {

        setTitle("Border Layout");

        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Add a BorderLayout manager to the content pane
        setLayout(new BorderLayout());

        // Create five buttons
        JButton button1 = new JButton("North Button");
        button1.addActionListener(new NorthColor());

        JButton button2 = new JButton("South Button");
        button2.addActionListener(new SouthColor());

        JButton button3 = new JButton("East Button");
        button3.addActionListener(new EastColor());

        JButton button4 = new JButton("West Button");
        button4.addActionListener(new WestColor());

        JButton button5 = new JButton("Center Button");
        button4.addActionListener(new CenterColor());

        // Add the five buttons to the content pane
        add(button1, BorderLayout.NORTH);
        add(button2, BorderLayout.SOUTH);
        add(button3, BorderLayout.EAST);
        add(button4, BorderLayout.WEST);
        add(button5, BorderLayout.CENTER);

        // Display the window.
        setVisible(true);
    }

    private class NorthColor implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            setBackground(Color.ORANGE);
        }
    }

    private class SouthColor implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            setBackground(Color.GREEN);
        }
    }

    private class EastColor implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            setBackground(Color.PINK);
        }
    }

    private class WestColor implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            setBackground(Color.WHITE);
        }
    }

    private class CenterColor implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            setBackground(Color.MAGENTA);
        }
    }

    public static void main(String[] args) {
        BorderWindow take = new BorderWindow();

        System.out.print(take);
    }
}
