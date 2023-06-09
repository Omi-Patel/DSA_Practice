import java.util.*;
class ToggleCase{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Any String : ");
		String name = sc.nextLine();
		
		StringBuilder sb = new StringBuilder(name);
		
		for(int i=0; i<sb.length(); i++){
			char ch = sb.charAt(i);
			
			if(ch >= 'a' && ch <= 'z'){		// Smaller Case
				char uch = (char)('A' + ch - 'a');  	// Converted into UpperCase.
				sb.setCharAt(i, uch);
			}
			
			else if(ch >= 'A' && ch <= 'Z'){		// Upper Case
				char lch = (char)('a' + ch - 'A');  	// Converted into LowerCase.
				sb.setCharAt(i, lch);
			}
		}
		
		System.out.println("Resulr : " + sb.toString());
	}
}