import java.util.Scanner;

public class Multiple {

    static void mul(int n, int k) {
        // Base
        if (k == 1) {
            System.out.println(n);
            return;
        }
        // Faith
        mul(n, k - 1);

        // SW
        System.out.println(n * k);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N : ");
        int n = sc.nextInt();

        System.out.print("Enter K : ");
        int k = sc.nextInt();

        mul(n, k);

        sc.close();
    }
}
