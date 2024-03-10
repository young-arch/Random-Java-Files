public class SearchArray {
    public static void main(String[] args) {

        int[] tests = { 87, 75, 98, 100, 82 };
        int results;
        results = sequentialSearch(tests, 100);

        if (results == -1) {
            System.out.println("You did not earn 100 on any test.");
        } else {
            System.out.println("You earned 100 on test " + (results + 1));
        }
    }

    public static int sequentialSearch(int[] array, int value) {
        int index;
        int element;
        boolean found;
        index = 0;
        element = -1;
        found = false;

        while (!found && index < array.length) {
            if (array[index] == value) {
                found = true;
                element = index;
            }
            index++;
        }
        return element;
    }

}
