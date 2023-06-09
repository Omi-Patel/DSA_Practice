class Armstrong{
	public static void main(String[] args){
		int n = 125;
		int org = n;
		int sum = 0;
		int count = 0;
		int temp = n;
		while(temp != 0){
			temp = temp / 10;
			count++;
		}
		System.out.println("Digit : " + count);
		
		for(int i=0; i<count; i++){
			int rem = n % 10;
			sum = sum + (int)Math.pow(rem, count);
			n = n / 10;
		}
		System.out.println("Sum : " + sum);
		
		if(sum == org){
			System.out.println(org + " is Armstrong Number");
		}
		else{
			System.out.println(org + " is Not Armstrong Number");
		}
	}
}