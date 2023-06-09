import java.util.*;
class StockSpan{
	
	public static void main(String[] args){
		
		int arr[] = {2, 3, 1, 4, 9, 5, 8, 10, 7, 6};
		int n = arr.length;
		
		// Printing Given Array
		for(int i=0; i<n; i++){
			System.out.print(arr[i] + " ");
		}
		
		Stack<Integer> st = new Stack<>();
		st.push(0);
		
		int span[] = new int[n];
		span[0] = 1;

		for(int i=1; i<n; i++){
			while(st.size() > 0 && arr[i] > arr[st.peek()]){
				st.pop();
			} 
			
			if(st.size() == 0){
				span[i] = i + 1;
			} else{
				span[i] = i - st.peek();
			}
			
			st.push(i);
		}
		
		System.out.println();
		
		// Printing Answer
		for(int i=0; i<n; i++){
			System.out.print(span[i] + " ");
		}
	}
	
}