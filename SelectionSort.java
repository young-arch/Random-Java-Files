public class SelectionSort {
    public static void main(String[] args) {
        int[] numbers = { 86, 81, 21, 34, 35, 66, 63, 34, 12, 1, 2, 389, 674, 5, 8, 7 };

        seleSort(numbers);

    }

    public static void seleSort(int[] array) {
        int startScan, index, minIndex, minValue;

        for (startScan = 0; startScan < (array.length - 1); startScan++) {
            minIndex = startScan;
            minValue = array[startScan];
            for (index = startScan + 1; index < array.length; index++) {
                if (array[index] < minValue) {
                    minValue = array[index];
                    minIndex = index;

                }

            }
            array[minIndex] = array[startScan];
            array[startScan] = minValue;
        }

        for (int val : array) {
            System.out.print(val + " ");
        }

    }

}
