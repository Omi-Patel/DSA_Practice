import java.util.*;
class TwoSumHash{
	public static void main(String[] args){
		
		int arr[] = {1, 3, 7, 5, 14, 9};
		int target = 17;
		int ans[] = new int[2];
		
		HashMap<Integer, Integer> list = new HashMap<>();
		for(int i=0; i<arr.length; i++){
			int sno = target - arr[i];
			
			if(list.containsKey(sno)){
				ans[0] = list.get(sno);
				ans[1] = i;
				break;
			}
			list.put(arr[i], i);
		}		
		System.out.println("Sum is Present at indexes : " + ans[0] + " and " + ans[1]);
	}
}