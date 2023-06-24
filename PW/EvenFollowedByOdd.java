public class EvenFollowedByOdd {

    static void printArray(int a[]) {
        int n = a.length;

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println();
    }

    static void swap(int a[], int x, int y) {
        int temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }

    static void sortArray(int a[]) {
        int n = a.length;

        int i = 0;
        int j = n - 1;

        while (i < j) {
            if (a[i] % 2 == 0 && a[j] % 2 == 1) {
                i++;
                j--;
            } else if (a[i] % 2 == 0) {
                i++;
            } else if (a[j] % 2 == 1) {
                j--;
            } else {
                swap(a, i, j);
                i++;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int a[] = { 3, 8, 2, 4, 5, 8, 5, 9, 6, 7 };

        sortArray(a);

        printArray(a);
    }
}
