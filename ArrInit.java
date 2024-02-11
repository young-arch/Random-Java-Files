public class ArrInit {
    public static void main(String[] args) {

        int[] days = { 31, 30, 28, 30, 29, 31, 30 };

        for (int index = 0; index < 7; index++) {

            System.out.println("Month " + (index + 1) + " has " + days[index] + " days");

        }
    }
}