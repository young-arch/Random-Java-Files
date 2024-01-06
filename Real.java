public class Real {
    public static void main(String[] args) {

        int[] marCh = { 4, 6, 8, 10, 12, 14, 16, 18 };
        int[] aprIl = { 4, 6, 8, 10, 12, 14, 16, 18 };

        int index = 0;
        boolean checkArray = true;

        if (marCh.length != aprIl.length) {
            checkArray = false;
        }

        while (checkArray && index < marCh.length) {
            if (marCh[index] != aprIl[index]) {
                checkArray = false;
            }
            index++;
        }
        if (checkArray) {
            System.out.println("The arrays are the same.");
        } else {
            System.out.println("The arrays are not the same.");
        }
    }
}