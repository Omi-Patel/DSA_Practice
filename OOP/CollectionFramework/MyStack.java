// Stack is very simillar to the ArrayList.. 
// But, In Stack, some other methods are there..
// Like : push(), pop(), peek(), empty(), search().

import java.util.*;

class MyStack{
	public static void main(String[] args){
		Stack<Integer> s = new Stack<>();
		
		s.push(7);
		s.push(4);
		s.push(2);
		s.push(14);
		s.push(8);
		
		//int p = s.pop();
		int top = s.peek();
		int pos = s.search(2); // -> It returns the position of the element.. (Accordong to LIFO concepts)
		boolean res = s.empty();
		
		
		System.out.println(s);
		//System.out.println("Poped = " + p);
		System.out.println("Top = " + top);
		System.out.println("Position = " + pos);
		System.out.println("Is the Stack Empty ? : " + res);
	}
}