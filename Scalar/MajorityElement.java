// This Solution is performed in T.C = O(n2) & S.C = O(1)

// To Optimize ths solution we need to use HashMap... --> T.C = O(n) & S.C = O(n)

// Further Optimization Using Moore's Algorithm... --> T.C = O(n) & S.C = O(1)

class MajorityElement{
	public static void main(String[] args){
		
		int arr[] = {3, 2, 7, 2, 2, 7, 7, 2, 1, 2, 2, 2}; 	// 2 is present 6 times which is > 6
		//int arr[] = {3, 2, 1, 4, 2, 5, 7, 9}; 	
		// Find The Element Which is present > n/2 in the array
		
		int count = 0;
		int res = 0;
		
		for(int i=0; i<arr.length; i++){
			
			//Printing Array
			System.out.print(arr[i] + " ");
			
			
			for(int j=0; j<arr.length; j++){
				if(arr[j] == arr[i]){
					count++;
				}
				if(count > (arr.length)/2){
					res = arr[i];
					break;
				} 
			}
		}
		System.out.println();
		if(count > (arr.length)/2){
			System.out.println("Majority Element is : " + res);
		} else{
			System.out.println("Majority Element is Not Present ); ");
		}
	}
}