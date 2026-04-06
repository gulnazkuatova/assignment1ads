public class BinaryDecimal {

    public static int bin2dec(String s) {
        return bin2decHelper(s, 0);
    }

    private static int bin2decHelper(String s, int index) {
        if (index == s.length()) return 0;

        int bit = s.charAt(index) - '0';
        int power = s.length() - index - 1;

        return (bit << power) + bin2decHelper(s, index + 1);
    }

    public static void main(String[] args) {
        System.out.println("Binary to Decimal:");

        String b1 = "1010";
        String b2 = "11001";

        System.out.println(b1 + " -> " + bin2dec(b1));
        System.out.println(b2 + " -> " + bin2dec(b2));
    }
}