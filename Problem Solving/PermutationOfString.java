import java.util.*;
class PermutationOfString{
	
	static int fact(int n){
		int m = 1;
		for(int i=2; i<=n; i++){
			m = m * i;
		}
		return m;
	}
	
		static void solution(String s){
		int len = s.length();
		int total = fact(len);
		
		for(int i=0; i<total; i++){
			StringBuilder sb = new StringBuilder(s);
			int temp = i;
			
			for(int j=len; j>0; j--){
				int rem = temp % j;
				System.out.print(sb.charAt(rem));
				sb.deleteCharAt(rem);
				temp = temp / j;
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a String : ");
		String str = sc.next();
		
		solution(str);
	}
}