import java.util.Scanner;

public class DigitSum {

    static int sum(int n) {
        if (n == 0) {
            return 0;
        }

        return (n % 10) + sum(n / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter number: ");
        int n = sc.nextInt();

        int result = sum(n);

        System.out.println("sum of digits = " + result);

        sc.close();
    }
}