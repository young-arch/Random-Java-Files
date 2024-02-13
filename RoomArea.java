import javax.swing.JOptionPane;

public class RoomArea {
    public static void main(String[] args) {
        double number;
        double totalArea;
        String input;

        Rectangle Kitchen = new Rectangle(10, 2);
        Rectangle bedroom = new Rectangle(10, 2);
        Rectangle den = new Rectangle(12, 8);

        input = JOptionPane.showInputDialog("What is the kitchens length ");
        number = Double.parseDouble(input);
        Kitchen.setLength(number);

        input = JOptionPane.showInputDialog("What is the kitchens width ");
        number = Double.parseDouble(input);
        Kitchen.setWidth(number);

        input = JOptionPane.showInputDialog("What is the bedroom's length ");
        number = Double.parseDouble(input);
        bedroom.setLength(number);

        input = JOptionPane.showInputDialog("What is the bedroom's width ");
        number = Double.parseDouble(input);
        bedroom.setWidth(number);

        input = JOptionPane.showInputDialog("What is the den's length ");
        number = Double.parseDouble(input);
        den.setLength(number);

        input = JOptionPane.showInputDialog("What is the den's width ");
        number = Double.parseDouble(input);
        den.setWidth(number);

        totalArea = Kitchen.getArea() + bedroom.getArea() + den.getArea();

        JOptionPane.showMessageDialog(null, "The total area for the rooms is " + totalArea);
        System.exit(0);

    }
}