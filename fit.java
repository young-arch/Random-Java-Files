import java.util.Scanner;

public class fit {
    public static void main(String[] args) {
        int first;
        int last;
        int[] array = { 2, 4, 8, 10, 12, 14, 18, 20, 22, 24, 28, 30, 32, 34 };

        System.out.println("Enter the first number position you want to calculate from: ");
        Scanner input = new Scanner(System.in);
        first = input.nextInt();

        System.out.println("Enter the last number positon you want to calculate from: ");
        last = input.nextInt();

        System.out.println("The sum of  the range is " + solve(array, first, last));

    }

    public static int solve(int[] array, int first, int last) {

        if (first > last) {
            return 0;
        }

        else {
            return array[first] + solve(array, first + 1, last);
        }
    }

}
