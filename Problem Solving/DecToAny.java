// In this Program Decimal to Hexa is Not working Properly.. Check It ):

import java.util.Scanner;

class DecToAny{
	
	public static void DecToBin(int n){
		
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
	
	public static void DecToOct(int n){
		
		int ans = 0;
		int m = 1;
		
		while(n > 0){
			int rem = n % 8;
			
			ans = ans + (rem*m);
			
			m = m * 10;
			n = n / 8;
		}
		
		System.out.println("Binary Number = " + ans);
		
	}
	
	public static void DecToHex(int n){
		
		int ans = 0;
		int m = 1;
		
		while(n > 0){
			int rem = n % 16;
			
			ans = ans + (rem*m);
			
			
			m = m * 10;
			n = n / 16;
		}
		
		System.out.println("Binary Number = " + ans);
		
	}
	
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Any Decimal Number : ");
		int n = sc.nextInt();
		
		System.out.println();
		
		System.out.println("1. Decimal To Binary");
		System.out.println("2. Decimal To Octal");
		System.out.println("3. Decimal To Hexa");
		
		
		System.out.println("In which Base You Want To Convert..? ");
		System.out.print("Enter Your Choice : ");
		
		int choice = sc.nextInt();
		
		
		
		switch(choice){
			case 1:
				DecToBin(n);
				break;
				
			case 2:
				DecToOct(n);
				break;
				
			case 3:
				DecToHex(n);
				break;
				
			default :
				System.out.println("Invalid Input..Plz Enter Correct Ont :)");
			
		}
		
	}
}