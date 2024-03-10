public class RowSumming {
    public static void main(String[] args) {

        int[][] numbers = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
        int total;

        for (int row = 0; row < numbers.length; row++) {
            total = 0;
            for (int col = 0; col < numbers[row].length; col++) {

                total += numbers[row][col];
            }
            System.out.println("The total of row " + row + " is " + total);
        }
    }

}
