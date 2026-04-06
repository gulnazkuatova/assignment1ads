import java.util.Scanner;

public class ReverseString {

    static String reverse(String s) {
        if (s.isEmpty()) {
            return "";
        }

        return s.charAt(s.length() - 1) + reverse(s.substring(0, s.length() - 1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter string: ");
        String s = sc.nextLine();

        String result = reverse(s);

        System.out.println("reversed = " + result);

        sc.close();
    }
}