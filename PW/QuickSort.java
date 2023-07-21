public class QuickSort {

    static void printArray(int a[]) {
        for (int val : a) {
            System.out.print(val + " ");
        }
    }

    static void swap(int a[], int x, int y) {
        int temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }

    static int partition(int a[], int st, int end) {

        int pivot = a[st];

        int count = 0;
        for (int i = st + 1; i <= end; i++) {
            if (a[i] <= pivot) {
                count++;
            }
        }

        int pivotIndex = st + count;

        swap(a, st, pivotIndex);

        // set lesser values to pivot to left side
        int i = st;
        int j = end;

        while (i < pivotIndex && j > pivotIndex) {
            while (a[i] <= pivot) {
                i++;
            }
            while (a[j] > pivot) {
                j--;
            }

            if (i < pivotIndex && j > pivotIndex) {
                swap(a, i, j);
                i++;
                j--;
            }
        }

        return pivotIndex;
    }

    static void quickSort(int a[], int st, int end) {

        // BC
        if (st >= end)
            return;

        // SW
        int pi = partition(a, st, end);

        // RW
        quickSort(a, st, pi - 1);
        quickSort(a, pi + 1, end);

    }

    public static void main(String[] args) {
        int arr[] = { 3, 2, 2, 5, 5, 6, 1, 4 };

        System.out.println("Array Before Sorting");
        printArray(arr);
        System.out.println();

        quickSort(arr, 0, arr.length - 1);

        System.out.println("Array After Sorting");
        printArray(arr);
    }
}
