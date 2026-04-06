public class DecimalBinary {

    public static String dec2bin(int n) {
        if (n == 0) return "0";
        if (n == 1) return "1";
        return dec2bin(n / 2) + (n % 2);
    }

    public static void main(String[] args) {
        System.out.println("Decimal to Binary:");

        int num1 = 10;
        int num2 = 25;

        System.out.println(num1 + " -> " + dec2bin(num1));
        System.out.println(num2 + " -> " + dec2bin(num2));
    }
}