import java.util.*;

class DecToBin{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter any Decimal Number : ");
		int n = sc.nextInt();
		
		System.out.println();
		
		int ans = 0;
		int m = 1;
		
		while(n > 0){
			int rem = n % 2;
			
			ans = ans + (rem*m);
			
			m = m * 10;
			n = n / 2;
		}
		
		System.out.println("Binary Number = " + ans);
	}
}