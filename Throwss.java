import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Throwss {

    public static void main(String[] args) {
        String filename = "name.txt";

        System.out.println("Hello");
        displayFile();
    }

    public static void displayFile() throws FileNotFoundException {

        // Open the file
        File file = new File();
        Scanner inputFile = new Scanner(file);

        // Read and display the file's contents.
        while (inputFile.hasNext()) {
            System.out.println(inputFile.nextLine());
        }
        // Close the File
        inputFile.close();
    }

}
