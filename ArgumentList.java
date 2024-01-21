public class ArgumentList {
    public static void main(String[] args) {
        int first = 88;
        int second = 90;
        int third = 87;
        int fourth = 100;

        int tot = sum(first, second, third, fourth);

        System.out.println(tot);

    }

    public static int sum(int... numbers) {
        int total = 0;

        for (int val : numbers) {
            total += val;
        }

        return total;
    }

}
