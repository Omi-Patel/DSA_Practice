
// import java.util.*;
import java.lang.Math;

public class SortSquare {

    static void printArray(int a[]) {
        int n = a.length;

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println();
    }

    static void printReverse(int a[]) {
        int n = a.length;

        int i = 0;
        int j = n - 1;

        while (i < j) {
            // swap
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;

            i++;
            j--;
        }
        printArray(a);

    }

    static void squareArray(int a[]) {
        int n = a.length;
        int ans[] = new int[n];
        int k = 0;

        int i = 0;
        int j = n - 1;

        while (i <= j) {
            if (Math.abs(a[i]) > Math.abs(a[j])) {
                ans[k] = a[i] * a[i];
                k++;
                i++;
            } else {
                ans[k] = a[j] * a[j];
                k++;
                j--;
            }

        }
        printReverse(ans);
        // printArray(ans);

    }

    public static void main(String[] args) {
        int a[] = { -10, 3, 2, 4, 5 };

        squareArray(a);

    }
}
