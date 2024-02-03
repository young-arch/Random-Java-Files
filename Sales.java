import javax.swing.JOptionPane;
import java.util.Scanner;

public class Sales {
    public static void main(String[] args) {
        final int ONE_WEEK = 7;

        double[] sales = new double[ONE_WEEK];
        getValues(sales);

    }

    private static void getValues(double[] array) {

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter the sales for day " + (i + 1) + ": ");
            array[i] = input.nextDouble();
        }

    }

}
