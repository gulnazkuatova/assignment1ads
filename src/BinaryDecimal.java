import java.util.Scanner;

public class BinaryDecimal {

    public static int bin2dec(String s) {
        return helper(s, 0);
    }

    private static int helper(String s, int index) {
        if (index == s.length()) return 0;

        int bit = s.charAt(index) - '0';
        int power = s.length() - index - 1;

        return (bit << power) + helper(s, index + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a binary string: ");
        String s = sc.nextLine();

        System.out.println("Decimal: " + bin2dec(s));
    }
}