class PDI{
	public static void main(String[] args){
		int n = 5;
		
		pdi(n);
	}
	
	static void pdi(int n){
		if(n == 0){
			return;
		}
		System.out.println(n);
		pdi(n-1);
		System.out.println(n);
	}
}