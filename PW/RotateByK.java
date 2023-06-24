public class RotateByK {

    static void printArray(int a[]) {
        int n = a.length;

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println();
    }

    static void swap(int a[], int x, int y) {
        int i = x;
        int j = y;

        while (i < j) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;

            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5, 6, 7 };

        int n = a.length;

        int k = 8;

        k = k % n;

        swap(a, 0, n - k - 1);
        swap(a, n - k, n - 1);
        swap(a, 0, n - 1);

        printArray(a);
    }
}
