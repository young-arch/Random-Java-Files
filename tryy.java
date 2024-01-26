public class tryy {
    public static void main(String[] args) {

        int array[] = { 78, 88, 744, 46, 466, 768, 880, 806 };

        int results = sequential(array, 880);

        if (results == -1) {
            System.out.println("The value you entered was not found ");
        } else {
            System.out.println("The value was written in test " + (results + 1));

        }

    }

    public static int sequential(int[] array, int value) {

        int element;
        boolean found;

        element = -1;
        found = false;
        int index = 0;

        while (!found && index < array.length) {
            if (array[index] == value) {
                found = true;
                element = index;
            }
            index++;
        }
        return index;
    }

}
