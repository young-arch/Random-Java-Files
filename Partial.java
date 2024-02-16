import java.util.Scanner;

public class Partial {
    public static void main(String[] args) {
        final int ARRAY_SIZE = 100;
        int[] array = new int[ARRAY_SIZE];
        int count = 0;
        int number;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number or -1 to quit: ");
        number = input.nextInt();

        while (number != -1 && count < array.length) {
            array[count] = number;
            count++;
            System.out.println("Enter a number or -1 to quit: ");
            number = input.nextInt();
        }

        for (int val : array) {
            System.out.println(val + " ");

        }
        System.out.println(array.length);

    }

}
