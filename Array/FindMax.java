import java.util.*;
class FindMax{
	
	static void printArray(int arr[], int n){
		System.out.print("Your Array : ");
		
		for(int i=0; i<n; i++){
			System.out.print(arr[i] + " ");
		}
	}
	
	static int MaxEle(int arr[], int n){
		int max = Integer.MIN_VALUE;
		
		for(int i=0; i<n; i++){
			if(arr[i] > max){
				max = arr[i];
			}
		}
		
		return max;
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of the array : ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		for(int i=0; i<size; i++){
			arr[i] = sc.nextInt();
		}
		//int arr[] = {10, 4, 67, 3, 98};
		int n = arr.length;
		
		printArray(arr, n);
		System.out.println();
		
		int res = MaxEle(arr, n);
		System.out.print("Maximum Element : " + res);
	}
}