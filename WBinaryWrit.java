import java.io.*;

public class WBinaryWrit {
    public static void main(String[] args) throws IOException {

        String[] names = { "Asad", "Faster", "Gavriel" };

        FileOutputStream fStream = new FileOutputStream("randomNames.txt");
        DataOutputStream outputFile = new DataOutputStream(fStream);
        System.out.println("Writing to the file...");

        for (int i = 0; i < names.length; i++) {
            outputFile.writeUTF(names[i]);

        }
        System.out.print("Done");

        outputFile.close();

    }
}