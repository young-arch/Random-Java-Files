public class SummingDimensional {
    public static void main(String[] args) {

        int[][] numbers = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
        int total = 0;

        for (int row = 0; row < numbers.length; row++) {
            for (int col = 0; col < numbers[row].length; col++) {
                total += numbers[row][col];
            }
        }
        System.out.println("The total of these numbers in the array " + total);
    }
}