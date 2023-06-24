public class ThreeSum {
    public static void main(String[] args) {
        int arr[] = { 5, 1, 3, 2, 4 };
        int target = 11;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == target) {
                        System.out.println("Index : " + i + " & " + j + " & " + k);
                    }
                }
            }
        }
    }
}
