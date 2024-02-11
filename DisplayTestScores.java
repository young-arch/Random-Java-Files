import java.util.Scanner;

public class DisplayTestScores {
    public static void main(String[] args) {
        int sumTests;
        int[] tests;

        Scanner input = new Scanner(System.in);

        System.out.println("How many tests do you have? ");
        sumTests = input.nextInt();

        tests = new int[sumTests];

        for (int index = 0; index < sumTests; index++) {
            System.out.print("Enter test score " + (index + 1) + ": ");
            tests[index] = input.nextInt();
        }

        System.out.println();
        System.out.println("Here are the scores you entered");

        for (int val : tests) {
            System.out.println(val);
        }
    }

}
