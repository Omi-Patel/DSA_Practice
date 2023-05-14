class Fib{
	
	static int n1 = 0;
	static int n2 = 1;
	static int n3;
		
	public static void main(String[] args){
		int n = 10;
		int n1 = 0;
		int n2 = 1;
		int n3;
		
		System.out.print(n1 + " " + n2);
		
		fib(n-2);
	}
	
	static void fib(int n){
		if(n>0){
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			System.out.print(" " + n3);
			fib(n-1);
		}
	}
}