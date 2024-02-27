import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;

public class SalesReport2 {
    public static void main(String[] args) {

        String filename = "SalesData.txt";
        int months = 0;
        double oneMonth;
        double totalSales = 0.0;
        double averageSales;

        // Attempt to open the file by calling the openfile method
        Scanner inputFile = openFile(filename);

        while (inputFile == null) {
            filename = JOptionPane.showInputDialog("ERROR: " + filename + " does not exist.\n" +
                    "Enter another file name: ");

            inputFile = openFile(filename);
        }

        // Process the contents of the file
        while (inputFile.hasNext()) {
            try {
                // Get a month's sales amount.
                oneMonth = inputFile.nextDouble();

                // Accumulate the amount
                totalSales += oneMonth;

                // Increment the month counter
                months++;
            } catch (InputMismatchException e) {
                // Display an error message.
                JOptionPane.showMessageDialog(null, "Non-numeric data found in the file.\n" +
                        "The invalid record will be skipped.");

                // Skip past the invalid data.
                inputFile.nextLine();
            }
        }

        // Close the file
        inputFile.close();

        // Calculate the average.
        averageSales = totalSales / months;

        // Display the results.
        JOptionPane.showMessageDialog(null, String.format("Number of months: %d\n" +
                "Total Sales: $%,.2f\n" +
                "Average Sales: $%,.2f", months, totalSales, averageSales));

        System.exit(0);
    }

    public static Scanner openFile(String filename) {
        Scanner scan;

        // Attempt to open the file
        try {
            File file = new File(filename);
            scan = new Scanner(file);
        } catch (FileNotFoundException e) {
            scan = null;
        }

        return scan;
    }
}