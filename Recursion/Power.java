//This is the basic maths priblem pow(x, n)

class Power{
	public static void main(String[] args){
		int x = 3;
		int n = 4;
		
		int res = pow(x, n);
		System.out.println(res);
	}
	
	static int pow(int x, int n){
		
		if(n == 0){
			return 1;
		}
		
		int fnm1 = pow(x, n-1);
		int fn = x * fnm1;
		return fn;
	}
}