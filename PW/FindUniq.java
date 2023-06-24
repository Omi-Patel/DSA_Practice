public class FindUniq {
    public static void main(String[] args) {

        // Possible for only Postive Array
        int a[] = { 0, 1, 2, 0, 3, 2, 3, 5, 6 };

        int n = a.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] == a[j]) {
                    a[i] = -1;
                    a[j] = -1;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            if (a[i] != -1) {
                System.out.println("Unique Element : " + a[i]);
            }
        }
    }
}
