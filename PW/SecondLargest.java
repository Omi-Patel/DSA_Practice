public class SecondLargest {

    public static int FindLargest(int arr[]) {
        int max = Integer.MIN_VALUE;

        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int arr[] = { 5, 1, 3, 2, 4, 9, 5, 6, 9 };
        int n = arr.length;

        int LargestElement = FindLargest(arr);
        System.out.println("Largeset Element : " + LargestElement);

        for (int i = 0; i < n; i++) {
            if (arr[i] == LargestElement) {
                arr[i] = Integer.MIN_VALUE;
            }
        }

        int SecondLargest = FindLargest(arr);
        System.out.println("Second Largeset Element : " + SecondLargest);
    }
}
