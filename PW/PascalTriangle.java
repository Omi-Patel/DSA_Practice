import java.util.*;

public class PascalTriangle {

    static void print2DArray(int a[][]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + "    ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Row : ");
        int n = sc.nextInt();
        System.out.println();

        int a[][] = new int[n][];

        for (int i = 0; i < n; i++) {
            // step 1 -> i'th row has a[i+1]
            a[i] = new int[i + 1];

            // step 2 -> first & last element is 1
            a[i][0] = a[i][i] = 1;

            // step 3
            for (int j = 1; j < i; j++) {
                a[i][j] = a[i - 1][j] + a[i - 1][j - 1];
            }
        }
        print2DArray(a);
    }

}
