class Pattern2{
	public static void main(String[] args){
		int n = 5;
		
		int st = n/2 + 1;
		int sp = 1;
		
		for(int i=1; i<=n; i++){
			
			for(int j=1; j<=st; j++){
				System.out.print("*");
			}
			
			for(int j=1; j<=sp; j++){
				System.out.print(" ");
			}
			
			for(int j=1; j<=st; j++){
				System.out.print("*");
			}
			
			if(i <= n/2){
				st--;
				sp += 2;
			}else{
				st++;
				sp -= 2;
			}
			System.out.println();
		}
	}
}