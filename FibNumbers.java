public class FibNumbers {
    public static void main(String[] args) {
        System.out.println("The first 10 numbers in the Fibonacci series are: ");

        for (int i = 0; i < 10; i++) {

            System.out.println(fib(i) + " ");
        }

        System.out.println();
    }

    public static int fib(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

}
