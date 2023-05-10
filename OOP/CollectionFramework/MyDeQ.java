import java.util.*;
class MyDeQ{
	public static void main(String[] args){
		
		Deque<Integer> dq = new ArrayDeque<>();
		
		dq.add(4);
		dq.add(5);
		
		
		dq.offerFirst(2);
		dq.offerFirst(1);
		
		dq.offer(6);
		dq.add(8);
		
		System.out.println(dq);
		
	}
}