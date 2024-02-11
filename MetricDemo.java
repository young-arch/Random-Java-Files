import javax.swing.JOptionPane;

public class MetricDemo {

    public static void main(String[] args) {
        String input;
        double miles;
        double kilos;

        input = JOptionPane.showInputDialog("Enter a distance in miles ");
        miles = Double.parseDouble(input);

        // Convert the distance to kilometers
        kilos = Metrics.milesToKilometers(miles);
        JOptionPane.showMessageDialog(null, String.format("%.2f miles equals %,.2f kilometers.", miles, kilos));

        // Get a distance in kilometers
        input = JOptionPane.showInputDialog("Enter a distance in kilometers: ");
        kilos = Double.parseDouble(input);

        // Convert the distance in miles
        miles = Metrics.kilometersToMiles(kilos);
        JOptionPane.showMessageDialog(null, String.format("%.2f kilometers equals %,.2f miles", kilos, miles));

        System.exit(0);
    

    }
}
