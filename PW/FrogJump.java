public class FrogJump {

    static int bestJump(int a[], int n, int idx){
        if(idx == n-1){
            return 0;
        }

        int op1 = bestJump(a, n, idx+1) + Math.abs(a[idx] - a[idx+1]);

        if(idx == n-2) return op1;

        int op2 = bestJump(a, n, idx+2) + Math.abs(a[idx] - a[idx+2]);

        return Math.min(op1, op2);
    }
    public static void main(String[] args) {
        int h[] = {10, 30, 40, 20};

        System.out.println(bestJump(h, h.length, 0));
    }
}
