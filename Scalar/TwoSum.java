import java.util.*;
class TwoSum{
	public static void main(String[] args){
		ArrayList<Integer> l = new ArrayList<>();
		
		l.add(1);
		l.add(3);
		l.add(7);
		l.add(5);
		l.add(14);
		l.add(9);
		
		int target = 17;
		int ans[] = new int[2];
		
		for(int i=0; i<l.size(); i++){
			int cur = l.get(i);
			
			int res = target - cur;
			
			if(l.contains(res)){
				ans[0] = i;
				ans[1] = l.indexOf(res);
				break;
			}
		}
		
		System.out.println("Sum is Present at indexes : " + ans[0] + " and " + ans[1]);
	}
}