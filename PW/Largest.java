public class Largest {
    public static void main(String[] args) {
        int arr[] = { 5, 1, 3, 2, 4, 9, 5, 6, 9 };
        int max = Integer.MIN_VALUE;

        int n = arr.length;

        for(int i=0; i<n; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        System.out.println("Largest Element : " + max);
    }
}
