import java.util.Scanner;

public class Cold {
    public static void main(String[] args) {
        final int TACTIS = 5;

        int[] sper = new int[TACTIS];

        System.out.println("You are about to the values of the array ");

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < TACTIS; i++) {

            System.out.println("The value for the " + (i + 1) + " is : ");
            sper[i] = input.nextInt();

        }

        for (int val : sper) {
            System.out.print(val + " ");
        }
    }

}
