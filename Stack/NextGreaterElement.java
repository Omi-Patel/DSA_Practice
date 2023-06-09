import java.util.*;

class NextGreaterElement{
	public static void main(String[] args){
		
		int arr[] = {2, 3, 1, 4, 9, 5, 8, 10, 7, 6};
		int n = arr.length;
		
		// Printing Given Array
		for(int i=0; i<n; i++){
			System.out.print(arr[i] + " ");
		}
		
		
		int nge[] = new int[n];
		
		Stack<Integer> st = new Stack<>();
		// Pushing Last Element in the stack
		st.push(arr[n-1]);
		nge[n-1] = -1;
		
		for(int i=n-2; i>=0; i--){
			while(st.size() > 0 && st.peek() < arr[i]){
				st.pop();
			} 
			
			if(st.size() == 0){
				nge[i] = -1;
			} else{
				nge[i] = st.peek();
			}
			
			st.push(arr[i]);
		}
		
		System.out.println();
		
		// Printing Answer
		for(int i=0; i<n; i++){
			System.out.print(nge[i] + " ");
		}
	}
}