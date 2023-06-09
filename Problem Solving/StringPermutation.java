class StringPermutation{
	public static void main(String[] args){
		
		
		for(int i=0; i<6; i++){
			StringBuilder s = new StringBuilder("abc");
			int temp = i;
			
			for(int j=3; j>0; j--){
				int rem = temp % j;
				System.out.print(s.charAt(rem));
				s.deleteCharAt(rem);
				temp = temp / j;
			}
			System.out.println();
		}
	}
}