class SpiralTraversal{
	
	public static void main(String[] args){
		
		int arr[][] = {
			{1, 2, 3, 4, 5},
			{6, 7, 8, 9, 10},
			{11, 12, 13, 14, 15},
			{16, 17, 18, 19, 20},
			{21, 22, 23, 24, 25},
			{26, 27, 28, 29, 30}
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
		
		
		// Approach
		// Divide 4 walls
		
		int rmin = 0;
		int rmax = n-1;
		
		int cmin = 0; 
		int cmax = m-1;
		
		
		int count = 0;
		while(count < n*m){
			
			// Top Wall
			for(int i=cmin; i<=cmax; i++){
				System.out.print(arr[rmin][i] + " ");
				count++;
			}
			rmin++;
			
			// Right Wall
			for(int i=rmin; i<=rmax; i++){
				System.out.print(arr[i][cmax] + " ");
				count++;
			}
			cmax--;
			
			
			// Bottom Wall
			for(int i=cmax; i>=cmin; i--){
				System.out.print(arr[rmax][i] + " ");
				count++;
			}
			rmax--;
			
			
			// Left Wall
			for(int i=rmax; i>=rmin; i--){
				System.out.print(arr[i][cmin] + " ");
				count++;
			}
			cmin++;
			
			
		}
		
	}
	
}