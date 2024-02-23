public class New {
    public static void main(String[] args) {

        int[] myNumbers = { 89, 90, 12, 13, 17, 19, 30 };

        System.out.println("The minimum value for an int is " + Integer.MIN_VALUE);

        int specialNumber = 88;

        System.out.println(Integer.toBinaryString(specialNumber));
        System.out.println(Integer.toHexString(specialNumber));
        System.out.println(Integer.toOctalString(specialNumber));

    }

}
