public class Tocopy {
    public static void main(String[] args) {
        int[] arrayOne = { 2, 4, 3, 5, 7, 6, 8, 9 };
        int[] arrayTwo = new int[8];

        for (int i = 0; i < arrayOne.length; i++) {
            arrayTwo[i] = arrayOne[i];
        }
        System.out.println();
        arrayTwo[0] = 8;
        arrayOne[0] = 6;

        for (int val : arrayOne) {
            System.out.print(val + " ");
        }

        System.out.println();

        for (int val : arrayTwo) {
            System.out.print(val + " ");
        }
    }

}
