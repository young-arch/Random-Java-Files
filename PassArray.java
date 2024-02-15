import java.util.Scanner;

public class PassArray {
    public static void main(String[] args) {
        final int ARRAY_SIZE = 4;

        int[] numbers = new int[ARRAY_SIZE];

        getValues(numbers);
        System.out.println("Here are the " + "numbers that you entered: ");

        showArray(numbers);

    }

    private static void getValues(int[] array) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a series of " + array.length + " numbers");

        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter number " + (i + 1) + ": ");
            array[i] = input.nextInt();
        }
    }

    public static void showArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

}
