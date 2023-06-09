class RotateBy90{
	
	public static void main(String[] args){
		
		int arr[][] = {
			{1, 2, 3, 4, 5},
			{6, 7, 8, 9, 10},
			{11, 12, 13, 14, 15},
			{16, 17, 18, 19, 20},
			{21, 22, 23, 24, 25}
		};
		int n = arr.length;
		int m = arr[0].length;
		
		// Printing Given Array
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[0].length; j++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		// Step-1) Take Transpose of a Matrix
		for(int i=0; i<n; i++){
			for(int j=i+1; j<m; j++){
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}
		
		// After Taking the Transpose, we need to swap row with colomn
		int low = 0; 
		int high = m-1;
		
		while(low < high){						//Swapping a[0][0] with a[0][m-1]
			for(int i=0; i<n; i++){
				int con = arr[i][low];
				arr[i][low] = arr[i][high];
				arr[i][high] = con;
				
			}
			low++;
			high--;
		}
		
		// Printing the Answer
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[0].length; j++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	
}