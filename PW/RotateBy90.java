public class RotateBy90 {

    static void print2DArray(int a[][]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + "    ");
            }
            System.out.println();
        }
    }

    static void swapMatrix(int a[]){
        int i = 0;
        int j = a.length-1;

        while(i < j){
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;

            i++;
            j--;
        }
    }

    static void transposeMatrix(int a[][]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a[i].length; j++) {
                int temp = a[i][j]; // without using extrea space...
                a[i][j] = a[j][i];
                a[j][i] = temp;
                // ans[i][j] = a[j][i];
            }
        }
    }

    public static void main(String[] args) {
        int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        // step 1 -> Transpose
        transposeMatrix(a);

        // step 2 -> swap
        for(int i=0; i<a.length; i++){
            swapMatrix(a[i]);
        }

        // step 3 -> print
        print2DArray(a);
    }
}
