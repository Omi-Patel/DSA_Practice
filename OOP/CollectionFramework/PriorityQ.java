import java.util.*;

class PriorityQ{
	public static void main(String[] args){
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		pq.add(4);
		pq.add(3);
		pq.add(1);
		pq.add(5);
		pq.add(2);   // It prints the smallest element first and then remaining are placed randomly according to heap...
					// Suppose [1, 2, 4, 5, 3]
		
		pq.poll();   // It removes the first element(smallest) and set the next smallest element first [2, 5, 3, 4]
		pq.poll();  // [3, 5, 4] 
		
		System.out.println(pq);
		
	}
}