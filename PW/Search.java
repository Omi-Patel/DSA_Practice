import java.util.ArrayList;

public class Search {

// Returns ArrayList which containes all the indices of target
static ArrayList<Integer> allInd(int a[], int target, int idx){
    ArrayList<Integer> ans = new ArrayList<>();

    //Base
    if(idx == a.length){
        return ans;
    }

    // SW
    if(a[idx] == target){  // It gives only first occurence 
        ans.add(idx);
    }

    // Recursive
    ArrayList<Integer> smallAns =  allInd(a, target, idx+1);

    ans.addAll(smallAns);
    return ans;
}

// Return all Indices at which the target is present
    static void findEleAllInd(int a[], int target, int idx){
        int n = a.length;
        // Base
        if(idx == n){
            return;
        }

        //SW
        if(a[idx] == target){
            System.out.println(idx);
        }

        // Recursion
        findEleAllInd(a, target, idx+1);
    }

//Rerurns only first index at which the target is present
    static int findEleInd(int a[], int target, int idx){
        int n = a.length;
        // Base
        if(idx == n){
            return -1;
        }

        //SW
        if(a[idx] == target){
            return idx;
        }

        // Recursion
        return findEleInd(a, target, idx+1);
    }

//Returns True or False base on the existance of the target
    static boolean findEle(int a[], int target, int idx){
        int n = a.length;
        // Base
        if(idx == n){
            return false;
        }

        //SW
        if(a[idx] == target){
            return true;
        }

        // Recursion
        return findEle(a, target, idx+1);

    }

    public static void main(String[] args) {
        int a[] = {9, 3, 9, 2, 5, 6, 7, 9};
        int target = 9;

        System.out.println(allInd(a, target, 0));

        // findEleAllInd(a, target, 0);

        // System.out.println(findEleInd(a, target, 0));

        // if(findEle(a, target, 0)){
        //     System.out.println("Element Found");
        // } else{
        //     System.out.println("Element Not Found");
        // }
    }
}
