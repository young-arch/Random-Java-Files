import java.io.*;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class ExceptionMessage {

    public static void main(String[] args) {
        File file;
        Scanner inputFile;
        String fileName;

        // Get a file name from the user
        fileName = JOptionPane.showInputDialog("Enter the name of a file: ");

        // Attempt to open the file.
        try {
            file = new File(fileName);
            inputFile = new Scanner(file);
            JOptionPane.showMessageDialog(null, "The file was found.");
        }

        catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

        JOptionPane.showMessageDialog(null, "Done.");
        System.exit(0);
    }

}
