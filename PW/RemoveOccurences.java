import java.util.Scanner;

public class RemoveOccurences {

    static String removeA(String s, int idx) {

        // Base
        if (idx == s.length()) {
            return "";
        }

        // Recursive
        String smallAns = removeA(s, idx + 1);

        // SW
        if (s.charAt(idx) != 'a') {
            return s.charAt(idx) + smallAns;
        } else {
            return smallAns;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(removeA(s, 0));

        sc.close();
    }
}
