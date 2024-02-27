import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;

public class SalesReport {
    public static void main(String[] args) {

        String filename = "SalesData.txt"; // File name
        int months = 0; // Month counter
        double oneMonth; // one month's sales
        double totalSales = 0.0; // Total Sales
        double averageSales; // Average sales

        try {
            // Open the file.
            File file = new File(filename);
            Scanner inputFile = new Scanner(file);

            // Process the contents of the file
            while (inputFile.hasNext()) {

                // Get a month's sales amount
                oneMonth = inputFile.nextDouble();

                // Accumulate the amount
                totalSales += oneMonth;

                // Increment the month counter
                months++;
            }

            // Close the file.
            inputFile.close();

            // Calculate the average.
            averageSales = totalSales / months;

            // Display the results
            JOptionPane.showMessageDialog(null,
                    String.format("Number of months: %d\n" + "Total Sales: $%,.2f\n" + "Average Sales: $%,.2f", months,
                            totalSales, averageSales));

        }

        catch (Exception e) {
            // Thrown by the Scanner class's nextDouble
            // method when a non-numeric value is found

            JOptionPane.showMessageDialog(null, "Non-numeric data found in the file.");

        }
        System.exit(0);
    }

}