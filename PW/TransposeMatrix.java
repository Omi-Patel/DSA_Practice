public class TransposeMatrix {

    static void print2DArray(int a[][]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + "    ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int a[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

        // int r = a.length;
        // int c = a[0].length;

        // int ans[][] = new int[r][c]; This is using extra space 

        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a[i].length; j++) {
                int temp = a[i][j];   // without using extrea space...
                a[i][j] = a[j][i];
                a[j][i] = temp;
                // ans[i][j] = a[j][i];
            }
        }

        print2DArray(a);
        // print2DArray(ans);

    }
}
