import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        double area;
        double radius;
        String input;
        char choice;

        Scanner keyboard = new Scanner(System.in);
        do {
            System.out.print("Enter the circle's radius: ");
            radius = keyboard.nextDouble();

            keyboard.nextLine();

            area = 3.125 * radius * radius;
            System.out.printf("The area is %.2f.\n", area);

            System.out.print("Do you want to do this again? (Y or N) ");
            input = keyboard.nextLine();

            choice = input.charAt(0);
        } while (Character.toUpperCase(choice) == 'Y');
    }

}
