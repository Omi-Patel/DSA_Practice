import java.util.*;
class RemoveFromList{
	
	static boolean isPrime(int n){
		boolean check = true;
		
		for(int i=2; i*i<=n; i++){
			if(n % i == 0){
				check = false;
			}
		}
		return check;
	}
	
	public static void main(String[] args){
		ArrayList<Integer> al = new ArrayList<>();
		
		al.add(10);
		al.add(15);
		al.add(3);
		al.add(21);
		al.add(13);
		al.add(23);
		al.add(25);
		al.add(7);
		
		System.out.println("Your List : " + al);
		
		// Remove All The Prime Numbers From List : 
		for(int i=al.size()-1; i>=0; i--){
			int e = al.get(i);
			
			if(isPrime(e)){
				al.remove(i);
			}
		}
		
		System.out.println("Your Answer : " + al);
	}
}