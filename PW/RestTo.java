import java.util.Scanner;

public class RestTo {

    static int res(int p, int q) {
        if (q == 0) {
            return 1;
        }

        return p * res(p, q - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter p : ");
        int p = sc.nextInt();

        System.out.print("Enter q : ");
        int q = sc.nextInt();

        System.out.println(res(p, q));

        sc.close();
    }
}
