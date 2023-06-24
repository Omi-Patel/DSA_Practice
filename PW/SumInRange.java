public class SumInRange {

    static int PrefixSum(int a[], int n){
        int sum = 0;
        for(int i = 0; i<=n; i++){
            sum = sum + a[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int a[] = { 1, 3, 2, 4, 5 };
        // int n = a.length;

        int l = 3;
        int r = 4;


        int tSum = PrefixSum(a, r);
        int sSum = PrefixSum(a, l-1);

        int res = tSum - sSum;
        System.out.println(res);
    }
}
