import java.util.Scanner;

public class GCD {

    static int gcd(int x, int y){
        if(y == 0){
            return x;
        }

        return gcd(y, x%y);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N : ");
        int n = sc.nextInt();

        System.out.print("Enter K : ");
        int k = sc.nextInt();

        System.out.println(gcd(n, k));

        sc.close();
    }
}
