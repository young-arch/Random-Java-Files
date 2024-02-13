import java.util.Scanner;

public class PersonSearch {
    public static void main(String[] args) {
        String lookup;
        String[] names = { "Yasmine, Kabore", "Coleman, Degraft",
                "Rusell, Cindy", "William, Bacc",
                "Williams, Jean", "Cutshaw, Will",
                "Davis, George", "Russert, Phil",
                "David, Jenny", "Smith Chris" };

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the name you want to look up for: ");
        lookup = input.nextLine();

        System.out.println("Here are the names you searching for: ");

        for (String preferred : names) {
            if (preferred.startsWith(lookup)) {
                System.out.println(preferred);
            }
        }
    }

}
