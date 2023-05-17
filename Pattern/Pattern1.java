import java.util.*;
class Pattern1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The value of n : ");
		int n = sc.nextInt();
		
		System.out.println();
		
		int sp = n/2;
		int st = 1;
		int value = 1;
		
		
		for(int i=1; i<=n; i++){
			
			int cv = 1;
			
			for(int j=1; j<=sp; j++){
				System.out.print("\t");
			}
			for(int j=1; j<=st; j++){
				
				System.out.print(cv + "\t");
				
				if(j <= st/2){
					cv++;
				}else{
					cv--;
				}
			}
			
			if(i <= n/2){
				sp--;
				st += 2;
				value++;
			}else{
				sp++;
				st -= 2;
				value--;
			}
			
			System.out.println();
		}
	}
}