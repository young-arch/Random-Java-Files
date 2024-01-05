import java.io.*;

import javax.xml.crypto.Data;

/**
 * This program opens a binary file, reads and displays the contents
 */
public class WReadBinaryFile {
    public static void main(String[] args) throws IOException {

        int number; // Anumber read from the file
        boolean endOfFile = false; // EOF flag

        // Create the binary file input objects
        FileInputStream fStream = new FileInputStream("Numbers.dat");
        DataInputStream inputFile = new DataInputStream(fStream);

        System.out.println("Reading numbers from the file: ");

        // Rea the contents of the file.
        while (!endOfFile) {
            try {
                number = inputFile.readInt();
                System.out.print(number + " ");
            } catch (EOFException e) {
                endOfFile = true;
            }
        }

        System.out.println("\nDone.");

    }
}
