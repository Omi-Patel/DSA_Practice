import java.util.*;
class DuplicateBracket{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		// Taking Input as a String
		System.out.print("Enter The String (Equation) : ");
		String s = sc.nextLine();
		
		// Stack of character
		Stack<Character> st = new Stack<>();
		
		for(int i=0; i<s.length(); i++){
			char ch = s.charAt(i);
			
			if(ch == ')'){
				// We need to pop
				if(st.peek() == '('){
					System.out.println("Duplicate Bracket Occure !..");
					return;
				} else{
					while(st.peek() != '('){
						st.pop();
					}
					// To pop out the last item.
					st.pop();
				}
			} else{
				st.push(ch);
			}
		}
		
		System.out.println("Duplicate Brackets are not Present...");
	}
}