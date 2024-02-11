public class SelectSort {
    public static void main(String[] args) {

        int[] numbers = { 88, 12, 34, 24, 6, 47, 888, 6, 6790, 75, 4565, 778, 69 };

        selectionSort(numbers);

        for (int val : numbers) {
            System.out.println(val + " ");
        }

    }

    public static void selectionSort(int[] array) {

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
