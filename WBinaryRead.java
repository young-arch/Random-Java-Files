import java.io.*;

public class WBinaryRead {
    public static void main(String[] args) throws IOException {

        String name; // A name read from the file
        boolean endOfFile = false; // EOF flag

        FileInputStream fStream = new FileInputStream("randomNames.txt");
        DataInputStream inputFile = new DataInputStream(fStream);

        while (!endOfFile) {

            try {
                name = inputFile.readUTF();
                System.out.println(name + " ");
            } catch (EOFException e) {
                endOfFile = true;
            }
        }
        System.out.println("Done and dusted");
        inputFile.close();

    }

}
