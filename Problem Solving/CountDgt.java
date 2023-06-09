//Print the digit of the no.

class CountDgt{
	public static void main(String[] args){
		int n = 7000;
		
		//count the digit
		int temp = n;
		int count = 0;
		
		while(temp != 0){
			temp = temp / 10;
			count++;			//3
		}
		System.out.println(count);
		
		//int div = (int)Math.pow(10, count-1);
		
		//while(div != 0){
			//int q = n / div;
			//System.out.println(q);
			
			//n = n % div;
			//div = div / 10;
		//}
		
		int arr[] = new int[count];
		
		for(int i=0; i<count; i++){
			arr[i] = n % 10;
			n = n/10;
		}
		
		for(int i=count-1; i>=0; i--){
			System.out.println(arr[i]);
		}
	}
}