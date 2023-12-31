public class HighestValue {
    public static void main(String[] args) {

        int[] nums = { 88, 89, 34, 232, 539, 439, 888, 5, 42, 24, 565, 474 };

        int highest = nums[0];

        for (int index = 1; index < nums.length; index++) {
            if (nums[index] > highest) {
                highest = nums[index];
            }
        }

        System.out.println("The highestnumber is " + highest);

    }
}