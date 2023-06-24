public class SortArrayZeroAndOne {

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
            if (a[i] != 0 && a[j] != 1) {
                swap(a, i, j);
                // int temp = a[i];
                // a[i] = a[j];
                // a[j] = temp;

                i++;
                j--;
            } else if (a[i] == 0 && a[j] != 1) {
                i++;
            } else if (a[i] != 0 && a[j] == 1) {
                j--;
            } else {
                i++;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int a[] = { 1, 0, 0, 1, 1, 1, 0, 0 };

        sortArray(a);

        printArray(a);
    }
}
