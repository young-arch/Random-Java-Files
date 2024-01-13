public class RaggedArrays {
    public static void main(String[] args) {

        int[][] ragged = new int[4][];

        ragged[0] = new int[3];
        ragged[1] = new int[4];
        ragged[2] = new int[5];
        ragged[3] = new int[6];

        for (int index = 0; index < ragged.length; index++) {
            System.out.println("The number of columns " + "in row " + index +
                    " is " + ragged[index].length);
        }
    }

}
