public class BinarySort {
    public static void main(String[] args) {
        int[] array = { 88, 78, 76, 12, 85, 35, 35, 545, 255, 2522, 525, 2525, 5, 8, 84, 445 };

        selectonSort(array);

        int pos = biSearch(array, 12);

        System.out.println("The value you searching for is at index positin " + pos);

    }

    public static int biSearch(int[] array, int value) {

        int first;
        int last;
        int middle;
        int position;
        boolean found;
        first = 0;
        last = array.length - 1;
        position = -1;
        found = false;

        while (!found && first <= last) {
            middle = (first + last) / 2;
            if (array[middle] == value) {
                found = true;
                position = middle;
            } else if (array[middle] > value) {
                last = middle - 1;
            } else {
                first = middle + 1;
            }

        }
        return position;

    }

    public static void selectonSort(int[] array) {

        for (int index = 0; index < array.length - 1; index++) {
            for (int j = index + 1; j < array.length; j++) {

                if (array[j] < array[index]) {
                    int temp = array[j];
                    array[j] = array[index];
                    array[index] = temp;
                }

            }
        }
    }

}
