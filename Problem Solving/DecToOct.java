import java.util.Scanner;
class DecToOct{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter any Decimal Number : ");
		int n = sc.nextInt();
		
		System.out.println();
		
		int ans = 0;
		int m = 1;
		
		while(n > 0){
			int rem = n % 8;
			
			ans = ans + (rem*m);
			
			m = m * 10;
			n = n / 8;
		}
		
		System.out.println("Octal Number = " + ans);
	}
}