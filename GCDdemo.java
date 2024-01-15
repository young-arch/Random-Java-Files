import java.util.Scanner;

public class GCDdemo {
    public static void main(String[] args) {
        int num1, num2;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        num1 = input.nextInt();

        System.out.println("Enter another integer: ");
        num2 = input.nextInt();

        // Display the GCD
        System.out.println("The greatest common divisor of these two numbers is " + gcd(num1, num2));
    }

    public static int gcd(int x, int y) {
        if (x % y == 0) {
            return y;
        }

        else {
            return gcd(y, x % y);
        }
    }
}
