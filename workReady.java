import java.io.File;
import java.util.Scanner;

public class workReady {
    public static void main(String[] args) {
    }

    final int SIZE = 5;
    int[] numbers = new int[SIZE];
    int index = 0;

    File file = new File("values.txt");

    Scanner inputFile = new Scanner(file);

    while(inputFile.hasNext()&&index<numbers.length)
    {

        numbers[index] = inputFile.nextInt();
        index++;
    }inputFile.close();

}
