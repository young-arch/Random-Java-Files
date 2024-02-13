import java.io.*;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class OpenFile {
    public static void main(String[] args) {

        File file; // For the file input
        Scanner inputFile; // For file input
        String fileName; // To hold a file Name

        // Get a file name from the user
        fileName = JOptionPane.showInputDialog("Enter the name of the file: ");

        // Attempt to open the file
        try {
            file = new File(fileName);
            inputFile = new Scanner(file);
            JOptionPane.showMessageDialog(null, "The file was found");

        } catch (FileNotFoundException e) {

            JOptionPane.showMessageDialog(null, "File not found");
        }
        JOptionPane.showMessageDialog(null, "Done");
        System.exit(0);

    }
}
