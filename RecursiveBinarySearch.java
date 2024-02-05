import java.util.Scanner;

/**
 * This program demonstrates the recursive binary search method
 */

public class RecursiveBinarySearch {
    public static void main(String[] args) {
        int searchValue;
        int result;
        String input;
        char again;

        // The values in the following array are sorted in ascending order
        int numbers[] = { 101, 142, 147, 189, 199, 207, 222, 234, 289, 296, 310, 319, 388,
                394, 417, 429, 447, 521, 536, 600 };

        Scanner keyboard = new Scanner(System.in);

        do {
            // Get a value to search for
            System.out.println("Enter a value to search for: ");
            searchValue = keyboard.nextInt();

            // Search for the value
            result = binarySearch(numbers, 0, numbers.length - 1, searchValue);

            // Display the results
            if (result == -1) {
                System.out.print(searchValue + " was not found.");
            } else {
                System.out.println(searchValue + " was found at " + "element " + result);
            }
            System.out.println("Do you want to search again?" + " (Y or N)");

            // Consume the remaining new line
            input = keyboard.nextLine();

        } while (input.charAt(0) == 'y' || input.charAt(0) == 'Y');

    }

    public static int binarySearch(int[] array, int first, int last, int value) {
        int middle; // Mid point of search

        // Test for the bawse case where the value is not found
        if (first > last) {
            return -1;
        }

        // Calculate the middle position
        middle = (first + last) / 2;

        // Search for the value
        if (array[middle] == value) {
            return middle;
        } else if (array[middle] < value) {
            return binarySearch(array, middle + 1, last, value);
        } else {
            return binarySearch(array, first, middle - 1, value);
        }

    }

}