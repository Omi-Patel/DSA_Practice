public class PrefixSum {
    public static void main(String[] args) {
        int a[] = {0, 1, 2, 3, 4};

        for(int i=1; i<a.length; i++){
            a[i] = a[i] + a[i-1];
        }

        for(int i=0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
        // System.out.println();
    }
}
