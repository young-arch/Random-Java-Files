
public class aa {

    public int findSpecialInteger(int[] arr) {
        int targetFrequency = arr.length / 4;

        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            int count = 1;
        }

        // Count the occurrences of the current element
        while (i + 1 < arr.length && arr[i + 1] == current) {
            i++;
            count++;
        }
        if (count > targetFrequency) {
            return current;
        }
        return -1;
    }

}
