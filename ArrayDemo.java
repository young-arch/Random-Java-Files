import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        final int EMPLOYEES = 3;

        int[] hours = new int[EMPLOYEES];

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the hours worked by " + EMPLOYEES + " employees");

        System.out.println("Employee 1");
        hours[0] = input.nextInt();

        System.out.println("Employee 2");
        hours[1] = input.nextInt();

        System.out.println("Employee 3");
        hours[2] = input.nextInt();

        System.out.println("The hours you entered are: ");
        System.out.println(hours[0]);
        System.out.println(hours[1]);
        System.out.println(hours[2]);

    }

}
