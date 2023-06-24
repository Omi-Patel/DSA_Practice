import java.util.Scanner;

public class Factorial {

    static int fact(int n){
        //Base
        if(n == 0 || n == 1){
            return 1;
        } else{
            return n * fact(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int n = sc.nextInt();

        System.out.println();

        int ans = fact(n);
        System.out.println(ans);

        sc.close();
    }
}
