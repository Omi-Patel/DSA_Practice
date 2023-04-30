import java.util.*;
class BarChat{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How Many Values ? : ");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		//get values
		System.out.print("Enter Numbers : ");
		for(int i=0; i<n; i++){
			arr[i] = sc.nextInt();
		}
		
		//find max
		int max = arr[0];
		for(int i=1; i<arr.length; i++){
			if(arr[i] > max){
				max = arr[i];
			}
		}
		
		//System.out.println(max);
		
		for(int j=max; j>=1; j--){
			for(int i=0; i<arr.length; i++){
				if(arr[i] >= j){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}