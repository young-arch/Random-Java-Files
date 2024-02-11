import java.util.Scanner;

public class ArrDemo {
    public static void main(String[] args) {
        final int EMPLOYEES = 3;

        int[] hours = new int[EMPLOYEES];
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the hours worked by " + EMPLOYEES + " employees.");

        for (int index = 0; index < EMPLOYEES; index++) {
            System.out.println("Employee " + (index + 1) + ":");
            hours[index] = input.nextInt();
        }

        System.out.println("The hours you entered are: ");

        for (int index = 0; index < EMPLOYEES; index++) {
            System.out.println(hours[index]);
        }
    }

}
