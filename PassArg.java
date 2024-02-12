public class PassArg {
    public static void main(String[] args) {
        int x = 10;
        System.out.println("I am passing values to displayValue.");
        displayValue(5);
        displayValue(x);
        displayValue(x * 4);
        displayValue(Integer.parseInt("700"));
        System.out.println("Now I am back in the main.");
        showSum(88, 88.5);
        showLength("Gabriel Farida");

    }

    public static int displayValue(int num) {
        System.out.println("The value is " + num);

        return num;
    }

    public static double showSum(double num1, double num2) {
        double sums;
        sums = num1 + num2;
        System.out.println("The sum of the two is numbers is " + sums);
        return sums;
    }

    public static void showLength(String str) {
        System.out.println(str + " is " + str.length() + " Characters long");
    }

}
