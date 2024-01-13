public class RealCheck {
    public static void main(String[] args) {

        int[] firstArray = { 2, 4, 6, 8, 10, 12 };
        int[] secondArray = { 2, 4, 6, 8, 10, 12 };

        boolean arraysEqual = true;

        int index = 0;

        if (firstArray.length != secondArray.length) {
            arraysEqual = false;
        }
        while (arraysEqual && index < firstArray.length) {
            if (firstArray[index] != secondArray[index]) {
                arraysEqual = false;
            }
            index++;
        }
        if (arraysEqual) {
            System.out.println("The arrays are equal ");
        } else {
            System.out.println("The arrays are not equal ");
        }
    }

}
