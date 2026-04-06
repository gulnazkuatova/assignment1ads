public class Fibonacci {

    static int callCount = 0;

    public static int fib(int n) {
        callCount++;

        if (n == 0) return 0;
        if (n == 1) return 1;

        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        int n = 4;

        callCount = 0;

        int result = fib(n);

        System.out.println("fib(" + n + ") = " + result);
        System.out.println("Number of calls: " + callCount);
    }
}