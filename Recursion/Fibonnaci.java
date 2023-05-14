import java.util.*;

class Fibonnaci{
	
	static int a = 0, b = 1, c;
	
	static void fib(int n){
	
		
		if(n > 0){
			c = a + b;
			a = b;
			b = c;
			System.out.print(" " + c);
		
			fib(n-1);
		}
		
	}
	
	public static void main(String[] args){
		//Scanner sc = new Scanner(System.in);
		int n = 10;
		
		System.out.print(a + " " + b);
		fib(n-2);
		
	}
}