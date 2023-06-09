import java.util.*;
class SlidingWindowMax{
	public static void main(String[] args){
		int a[] = {5, -1, 0, 9, -4, 7, 1};
		int n = a.length;
		int k = 3;
		
		for(int i=0; i<=n-k; i++){
			int max = Integer.MIN_VALUE;
			for(int j=i; j<=i+k-1; j++){
				if(a[j] > max){
					max = a[j];
				}
			}
			
			System.out.print(max + " ");
		}
	}
}