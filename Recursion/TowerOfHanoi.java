import java.util.*;
class TowerOfHanoi{
	
	static void toh(int n, int t1, int t2, int t3){
		
		// Base Case
		if(n == 0){
			return;
		}
		
		// Left Call -> Move n-1 Disks from t1 -> t3
		toh(n-1, t1, t3, t2);
		
		// Middle Statement
		System.out.println("Move " + n + "[" + t1 + " -> " + t2 + "]");
		
		// Right Call
		toh(n-1, t3, t2, t1);
		
		
	}
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		// Number of Disks in One Tower
		int n = sc.nextInt();
		
		// Three Towers
		int t1 = sc.nextInt();
		int t2 = sc.nextInt();
		int t3 = sc.nextInt();
		
		toh(n, t1, t2, t3);
		
	}
}