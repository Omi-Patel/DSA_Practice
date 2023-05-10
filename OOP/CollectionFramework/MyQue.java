import java.util.*;

class MyQue{
	public static void main(String[] args){
		
		Queue<Integer> q1 = new LinkedList<>();
		
		//q1.add(1);
		//q1.add(2);
		//q1.add(3);
		//q1.add(4);
		//q1.add(5);
		
		q1.offer(5);   // offer() works same as the add() -> EnQueue
		q1.offer(1);
		q1.offer(2);
		q1.offer(3);
		q1.offer(4);
		
		q1.poll();  //poll() works same as the remove() -> DeQueue
		
		
		System.out.println(q1 + " ");
		
	}
}