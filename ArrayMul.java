import java.util.*;
class ArrayMul{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		//1st Array
		System.out.println("Enter the Details of Array-1....");
		System.out.println();
		
		System.out.print("Enter the number of row : ");
		int r1 = sc.nextInt();
		
		System.out.print("Enter the number of colomn : ");
		int c1 = sc.nextInt();
		
		int arr1[][] = new int[r1][c1];
		
		//getting the data
		for(int i=0; i<arr1.length; i++){
			for(int j=0; j<arr1[0].length; j++){
				System.out.print("Enter element " + "[" + i + "]" + "[" + j + "] : ");
				arr1[i][j] = sc.nextInt();
			}
		}
		
		
		//2nd Array
		System.out.println("Enter the Details of Array-2....");
		System.out.println();
		
		System.out.print("Enter the number of row : ");
		int r2 = sc.nextInt();
		
		System.out.print("Enter the number of colomn : ");
		int c2 = sc.nextInt();
		
		int arr2[][] = new int[r2][c2];
		
		//getting the data
		for(int i=0; i<arr2.length; i++){
			for(int j=0; j<arr2[0].length; j++){
				System.out.print("Enter element " + "[" + i + "]" + "[" + j + "] : ");
				arr2[i][j] = sc.nextInt();
			}
		}
		
		
		if(c1 != r2){
			
			System.out.println("Invalid Input..);");
			return;
			
		}
		
			//Multipliacation
			int ans[][] = new int[r1][c2];
			
			for(int i=0; i<r1; i++){
				for(int j=0; j<c2; j++){
					for(int k=0; k<c1; k++){
						ans[i][j] += arr1[i][k] * arr2[k][j];
					} 
				}
			}
		
		//Printing Data
		System.out.println("Output ..);");
		for(int i=0; i<r1; i++){
			for(int j=0; j<c2; j++){
				System.out.print(ans[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}