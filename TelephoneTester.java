import java.util.Scanner;

public class TelephoneTester {
    public static void main(String[] args) {

        String phoneNumber;
        Scanner input = new Scanner(System.in);

        // Get an unformatted telephone number.
        System.out.println("Enter an unformatted telephone number: ");
        phoneNumber = input.nextLine();

        // Format the telephone number
        System.out.print("Formatted: " + Telephone.format(phoneNumber));

        // Get a formatted telephone number.
        System.out.println("Enter a telephone number formatted as ");
        System.out.print("(XXX)XXX-XXXX : ");
        phoneNumber = input.nextLine();

        // Unformat the telephone number.
        System.out.println("Unformatted: " + Telephone.unformat(phoneNumber));

    }

}
