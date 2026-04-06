public class StringPermutation {

    public static void printPermutations(String s) {
        permute("", s);
    }

    private static void permute(String prefix, String remaining) {
        if (remaining.length() == 0) {
            System.out.println(prefix);
            return;
        }

        for (int i = 0; i < remaining.length(); i++) {
            permute(prefix + remaining.charAt(i),
                    remaining.substring(0, i) + remaining.substring(i + 1));
        }
    }

    public static void main(String[] args) {
        System.out.println("Permutations of 'abc':");
        printPermutations("abc");
    }
}