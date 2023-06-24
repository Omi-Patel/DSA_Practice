import java.util.Scanner;

class Print1ToN {

    static void printNo(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }

        System.out.println(n);   //Prints N to 1
        printNo(n - 1);
        // System.out.println(n);   // Prints 1to N
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int n = sc.nextInt();

        System.out.println();

        printNo(n);

        sc.close();
    }
}