class CompareTriplet{
	
	public static void main(String args[]){
		int a[] = {1, 2, 3};
		int b[] = {0, 2, 1};
		
		int a1 = 0;
		int b1 = 0;
		
		for(int i=0; i<a.length; i++){
			if(a[i] > b[i]){
				a1++;
			}
			else if(a[i] == b[i]){
				
			}
			else{
				b1++;
			}	
		}
		
		System.out.print(a1 + " " + b1);
	}
	
}