// Not Working..);


import java.util.*;
class ThreeSum{
	public static void main(String[] args){
		int arr[] = {3, -1, 5, 7, -2, 1, 0, 3, 2, 1};
		int n = arr.length;
		int target = 6;
		
		Arrays.sort(arr);
		for(int i=0; i<n; i++){
			if(i == 0 || arr[i] != arr[i-1]){
				int j = i+1;
				int k = n-1;
				int newTarget = target - arr[i];
				
				while(j < k){
					if(arr[j] + arr[k] == newTarget){
						System.out.print(arr[i] + " " + arr[j] + " " + arr[k]);
						
						while(j < k && arr[j] == arr[j+1])
							j++;
						while(j < k && arr[k] == arr[k-1])
							k--;
						
					}else if(arr[j] + arr[k] < newTarget){
						j++;
					}else{
						k--;
					}
				}
			}
		}
	}
}