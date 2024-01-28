public class AvgArr {
    public static void main(String[] args) {
        int[] nuums = { 8, 79, 7, 9, 10 };
        int total = 0;
        double average;

        for (int i = 0; i < nuums.length; i++) {
            total += nuums[i];
        }
        average = total / nuums.length;

        System.out.println("The average is " + average);

    }
}