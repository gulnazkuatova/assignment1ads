import java.util.Scanner;

public class ReverseInteger {

    static void printReversal(int n) {
        if (n == 0) {
            return;
        }

        System.out.print(n % 10);
        printReversal(n / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter number: ");
        int n = sc.nextInt();

        printReversal(n);

        sc.close();
    }
}
