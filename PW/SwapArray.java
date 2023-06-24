public class SwapArray {

    static void printArray(int a[]){
        int n = a.length;

        for(int i=0; i<n; i++){
            System.out.print(a[i] + " ");
        }

        System.out.println();
    }

    static void printReverse(int a[]){
        int n = a.length;

        int i = 0;
        int j = n-1;

        while(i < j){
            //swap
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;

            i++;
            j--;
        }

        printArray(a);
    }
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6};
        printArray(a);

        // int n = a.length;

        printReverse(a);
    }
}
