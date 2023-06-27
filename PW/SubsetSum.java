class SubsetSum{

    static void printSubSum(int a[], int n, int idx, int sum){
        if(idx == n){
            System.out.println(sum);
            return;
        }

        printSubSum(a, n, idx+1, sum+a[idx]);
        printSubSum(a, n, idx+1,sum);
    }
    public static void main(String[] args) {
        int a[] = {1, 2, 3};
        int n = a.length;

        printSubSum(a, n, 0, 0);
    }
}