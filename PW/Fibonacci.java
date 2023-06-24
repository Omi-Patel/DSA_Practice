import java.util.Scanner;

public class Fibonacci {

    static int fib(int n) {
        // Base
        if (n == 0 || n == 1) {
            return n;
        }

        // Faith
        int pre = fib(n - 1);
        int prePre = fib(n - 2);

        // SW
        return pre + prePre;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            System.out.println(fib(i));
        }

        // int ans = fib(n);
        // System.out.println(ans);

        sc.close();
    }
}
