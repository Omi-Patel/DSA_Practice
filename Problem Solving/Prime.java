//This program will generate the prime no. between given range

class Prime{
	public static void main(String[] args){
		int low = 5;
		int high = 15;
		
		for(int i=low; i<=high; i++){
			int count = 0;
			
			for(int j=2; j<i/j; j++){
				if(i % j == 0){
					count++;
					break;
				}
			}
			
			if(count == 0){
				System.out.println(i);
			}
		}
	}
}