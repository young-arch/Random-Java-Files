public class ReturnArray {
    public static void main(String[] args) {
        double[] values;

        values = getArray();

        for (double num : values) {
            System.out.println(num + " ");
        }

    }

    public static double[] getArray() {

        double[] array = { 2.2, 3.2, 3.3, 3.4, 3.5 };

        return array;
    }

}
