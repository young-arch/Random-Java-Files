public class Ss {
    public static void main(String[] args) {

        int[] list = { 88, 87, 89, 90, 98, 87, 9767, 65, 5643, 34, 54, 45, 345, 344 };

        for (int i = 0; i < list.length - 1; i++) {
            for (int j = i + 1; j < list.length; j++) {

                if (list[j] < list[i]) {
                    list[j] = temp;

                }

            }
        }
    }

}
