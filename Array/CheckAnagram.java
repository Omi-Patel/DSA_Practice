import java.util.*;

class CheckAnagram{
	
	public static void main(String args[]){
		
		String a = "aac";
		String b = "aca";
		
		a = a.toLowerCase();
		b = b.toLowerCase();
		
		if(a.length() == b.length()){
			
			char arr1[] = a.toCharArray();
			char arr2[] = b.toCharArray();
			
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			
			boolean result = Arrays.equals(arr1, arr2);
			
			if(result){
				System.out.println("Anagram");
			}
			else{
			System.out.println("Not Anagram");
			}
		}
		
		else{
			System.out.println("Not Anagram");
		}
		
		
	}
	
}