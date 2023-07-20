class MergeSort {

    static void printArray(int arr[]) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
    }

    static void merge(int arr[], int l, int mid, int r) {
        int n1 = mid - l + 1;
        int n2 = r - mid;

        int lArr[] = new int[n1];
        int rArr[] = new int[n2];

        int i, j, k;

        for (i = 0; i < n1; i++) {
            lArr[i] = arr[l + i];
        }
        for (j = 0; j < n2; j++) {
            rArr[j] = arr[mid + 1 + j];
        }

        i = 0;
        j = 0;
        k = l;

        // Sorting
        while (i < n1 && j < n2) {
            if (lArr[i] < rArr[j]) {
                arr[k++] = lArr[i++];
            } else {
                arr[k++] = rArr[j++];
            }
        }

        while (i < n1) {
            arr[k++] = lArr[i++];
        }

        while (j < n2) {
            arr[k++] = rArr[j++];
        }
    }

    static void mergeSort(int arr[], int l, int r) {

        // BC
        if (l >= r) {
            return;
        }

        int mid = (l + r) / 2;

        // RW
        mergeSort(arr, l, mid);
        mergeSort(arr, mid + 1, r);

        // SW
        merge(arr, l, mid, r);

    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 5, 1, 3 };
        int n = arr.length;

        System.out.println("Array Before Sorting");
        printArray(arr);

        System.out.println();

        mergeSort(arr, 0, n - 1);

        System.out.println("Array After Sorting");
        printArray(arr);
    }
}