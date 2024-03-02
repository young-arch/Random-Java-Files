import java.io.*;
import java.util.Scanner;

public class TestScoreReader {
    private Scanner inputFile;
    private String line;

    public TestScoreReader(String filename) throws IOException {

        File file = new File(filename);
        inputFile = new Scanner(file);
    }

    public boolean readNextLine() throws IOException {

        boolean lineRead; // Flag variable

        // Determine whether there is more to read.
        lineRead = inputFile.hasNext();

        // If so, read the next line.
        if (lineRead) {
            line = inputFile.nextLine();
        }
        return lineRead;

    }

   public double getAverage(){
    int total = 0;
    double average;

    //Tokenize the last line read from the file
    String[] tokens = line.split(",");

    //Calculate the total of the test scores
    for(String str : tokens){
        total += Integer.parseInt(str);
    }

    average = (double) total / tokens.length;

    return average;
   }

 public void close() throws IOException{
    inputFile.close();
 }
}