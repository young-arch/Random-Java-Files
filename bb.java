import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class bb {
    public static void main(String[] args) {

        String filename = "SalesData.txt";
        try {

            // open the file
            File file = new File(filename);

            Scanner inputFile = new Scanner(file);

            try {
                // Read and display the file's contents.
                while (inputFile.hasNext()) {
                    System.out.println(inputFile.nextDouble());

                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid data found");
            } finally {
                // Close the file.
                inputFile.close();
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }

}
