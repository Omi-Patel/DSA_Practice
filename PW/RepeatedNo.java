public class RepeatedNo {

    public static void findAns(int a[]) {
        int n = a.length;
        int repeated = -1;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] == a[j]) {
                    repeated = a[j];
                    // It gives the first repeated number..
                    // System.out.println("First Repeated Number : " + repeated);
                    // return;
                }
            }
        }
        // If there is no return in if block then last repeated Number is found
        System.out.println("Last Repeated Number : " + repeated);
    }

    public static void main(String[] args) {
        int a[] = { 7, 6, 1, 0, 6, 1, 9 };
        // int n = a.length;

        findAns(a);
    }
}
