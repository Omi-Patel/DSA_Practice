import java.util.Stack;

public class RemoveOcc {

    static int[] remOcc(int arr[]){
        int n = arr.length;

        Stack<Integer> st = new Stack<>();

        for(int i=0; i<arr.length; i++){
            if(st.size() == 0 || st.peek() != arr[i]) st.push(arr[i]);

            else if(st.peek() == arr[i]){
                if(i == n-1 || arr[i] != arr[i+1]){
                    st.pop();
                }
            }
        }

        int ans[] = new int[st.size()];
        for(int i=ans.length-1; i>=0; i--){
            ans[i] = st.pop();
        }

        return ans;
    }
    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 2, 3, 3, 4, 5, 5, 6, 7, 7, 7, 8 };

        int res [] = remOcc(arr);

        for(int i=0; i<res.length; i++){
            System.out.print(res[i] + " ");
        }
    }
}
