//This is the very interesting problem in which the number is given and find the invesr position...
// For Ex. -> Given No. = 35124 in which the 5(Length of No. (n)) number is present and 
// its contain all the number upto 1 to 5 (1 to n) and no one will repeat.

//Explaination : In the given No. 4 at pos:1, 2 at pos:2, 1 at pos:3, 5 at pos:4, 3 at pos:5

//Pos -> No.		Pos -> No.				ANS : 41523
//1 -> 4			1 -> 3
//2 -> 2			2 -> 2
//3 -> 1			3 -> 5
//4 -> 5			4 -> 1
//5 -> 3			5 -> 4



import java.util.*;

class InverseNum{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n = sc.nextInt();
		
		int sum = 0;
		int count = 0;
		
		while(n != 0){
			int rem = n % 10;
			count++;
			sum = sum + (count * ((int)Math.pow(10, rem-1)));
			n = n/10;
		}
		System.out.println(sum);
		//System.out.print("Answer : ");
		
	}
}