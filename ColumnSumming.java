public class ColumnSumming {
    public static void main(String[] args) {

        int[][] numbers = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
        int total;

        for (int col = 0; col < numbers[0].length; col++) {
            total = 0;
            for (int row = 0; row < numbers.length; row++) {
                total += numbers[row][col];
            }
            System.out.println("Total of column " + col + " is " + total);

        }
    }

}
