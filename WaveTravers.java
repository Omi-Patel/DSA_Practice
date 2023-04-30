import java.util.*;
class WaveTravers{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of row : ");
		int r = sc.nextInt();
		
		System.out.print("Enter the number of colomn : ");
		int c = sc.nextInt();
		
		int arr[][] = new int[r][c];
		
		//getting the data
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[0].length; j++){
				System.out.print("Enter element " + "[" + i + "]" + "[" + j + "] : ");
				arr[i][j] = sc.nextInt();
			}
		}
		
		//Printing the data
		System.out.println("Output : ");
		for(int j=0; j<arr[0].length; j++){
			if(j%2 == 0){
				for(int i=0; i<arr.length; i++){
					System.out.println(arr[i][j]);
				}
			}else{
				for(int i=arr.length-1; i>=0; i--){
					System.out.println(arr[i][j]);
				}
			}
		}
	}
}