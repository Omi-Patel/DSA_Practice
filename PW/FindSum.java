import java.util.Scanner;

class FindSum{

    static int sum(int n){
        if(n > 0 && n < 10){
            return n;
        }

        return (n % 10) + sum(n/10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int n = sc.nextInt();

        System.out.println(sum(n));

        sc.close();
    }
}