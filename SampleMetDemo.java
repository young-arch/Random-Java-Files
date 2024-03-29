import javax.swing.JOptionPane;

public class SampleMetDemo {
    public static void main(String[] args) {

        String input;
        double miles;
        double kilos;

        input = JOptionPane.showInputDialog("Enter a distance in miles ");
        miles = Double.parseDouble(input);

        // Converting the Distance in miles to kilometers

        kilos = SampleMet.milesToKilometer(miles);

        JOptionPane.showMessageDialog(null, String.format("%,.2f miles equals %,.2f kilometers.", miles, kilos));

        // Converting the Distance in kilometers to miles
        input = JOptionPane.showInputDialog("Enter a distance in kilometers: ");
        kilos = Double.parseDouble(input);

        miles = SampleMet.kilometersTomile(kilos);

        JOptionPane.showMessageDialog(null, String.format("%,.2f kilometers equals %,.2f miles.", kilos, miles));

        System.exit(0);
    }

}
