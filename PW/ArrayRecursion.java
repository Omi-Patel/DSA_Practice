// import javax.sound.sampled.ReverbType;

public class ArrayRecursion {

    // Method for Print the Array
    static void printArray(int a[], int idx){
        // Base
        if(idx == a.length){
            return;
        }

        // Self Work
        System.out.print(a[idx] + " ");

        // Recursive
        printArray(a, idx+1);
    }


    // Method which return the Sum of the Array
    static int printSum(int a[], int idx){
        // Base
        if(idx == a.length){
            return 0;
        }

        // Small Ans
        int smallAns = printSum(a, idx+1);

        // Self Work
        return smallAns + a[idx];
    }

    // Method which return Max of the Array
    static int printMax(int a[], int idx){
        // Base
        if(idx == a.length-1){
            return a[idx];
        }

        // SA
        int sA = printMax(a, idx+1);

        //SW
        return Math.max(sA, a[idx]);
    }

    public static void main(String[] args) {
        int a[] = { 1, 20, 3, 40, 5, 6, 9 };

        // printArray(a, 0);

        // System.out.println("Sum : " + printSum(a, 0));

        System.out.println("Max : " + printMax(a, 0));
    }
}
