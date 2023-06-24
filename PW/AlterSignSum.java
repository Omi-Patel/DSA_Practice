import java.util.Scanner;

public class AlterSignSum {

    static int res(int n) {
        if (n == 0) {
            return n;
        }

        if (n % 2 == 0) {
            return res(n - 1) - n;
        }

        else {
            return res(n - 1) + n;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int n = sc.nextInt();

        int ans = res(n);
        System.out.println(ans);

        sc.close();
    }
}
