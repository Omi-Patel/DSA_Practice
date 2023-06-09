// This is the Optimized Solution of Majority Element Using Moore's Algorithm... --> T.C = O(n) & S.C = O(1)

class MooreMajorityElement{
	public static void main(String[] args){
		
		//int arr[] = {1, 7, 7, 2, 7, 1, 7, 1, 7, 7};
		int arr[] = {1, 2, 3, 6, 5, 4, 2, 1};
		int n = arr.length;
		
		int candidate = arr[0];
		int vote = 1;
		
		for(int i=1; i<arr.length; i++){
			if(candidate == arr[i]){
				vote++;
			} else{
				vote--;
			}
			
			if(vote == 0){
				candidate = arr[i];
				vote = 1;
			}
		}
		
		// To verify the candidate.
		int count = 0;
		for(int val : arr){
			if (val == candidate){
				count++;
			}
		}
		
		if(count > n/2){
			System.out.println("Majority Element : " + candidate);
		} else{
			System.out.println("Negative ); --> Majority Element is not present !..");
		}
	}
}