import java.util.Scanner;

public class Rainfall {
    public static void main(String[] args) {

        final int MONTHS = 12;

        double[] rains = new double[MONTHS];

        System.out.println("Enter the rate of rainfall for the 12 months in this year: ");

        for (int index = 0; index < MONTHS; index++) {

            while (rains[index] < 1) {

                Scanner input = new Scanner(System.in);

                System.out.print("Month " + (index + 1) + ": ");
                rains[index] = input.nextDouble();
            }
        }

        double rainTotal = totals(rains);
        System.out.println("The total rainfall for the year is " + rainTotal);

        double rainAverage = averages(rains, rainTotal);
        System.out.println("The average monthly rainfall for the year is " + rainAverage);

        mostRained(rains);

        leastRained(rains);

    }

    public static double totals(double[] array) {

        double total = 0;
        for (int index = 0; index < array.length; index++) {

            total += array[index];
        }
        return total;

    }

    public static double averages(double[] array, double total) {

        double average;
        average = array.length / total;
        return average;
    }

    public static void mostRained(double[] array) {
        double mostrain = array[0];
        for (int index = 1; index < array.length; index++) {
            if (mostrain > array[index]) {
                mostrain = array[index];
            }

        }
        System.out.println("The month that rained the most is Month " + mostrain);

    }

    public static void leastRained(double[] array) {
        double leastrain = array[0];
        for (int index = 1; index < array.length; index++) {
            if (leastrain < array[index]) {
                leastrain = array[index];
            }
        }
        System.out.println("The month that rained least is Month " + leastrain);

    }
}