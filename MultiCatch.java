import java.io.*;
import java.util.*;

public class MultiCatch {
    public static void main(String[] args){

        int number;

        try{
            //Open the file
            File file = new File("Numbers.txt");
            Scanner inputFile = new Scanner(file);

            //Process the contents of the file
            while(inputFile.hasNext()){
                //Get a number from the file
                number = inputFile.nextInt();

                //Display the number 
                System.out.println(number);
            }

            //Close the file
            inputFile.close();
        }

        catch(FileNotFoundException | InputMismatchException){
            //Display an error message
            System.out.println("Error processing the file.");
        }
    }

}
