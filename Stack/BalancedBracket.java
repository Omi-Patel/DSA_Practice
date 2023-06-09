import java.util.*;
class BalancedBracket{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter The String(Equation) : ");
		String s = sc.nextLine();
		
		Stack<Character> st = new Stack<>();
		
		for(int i=0; i<s.length(); i++){
			char ch = s.charAt(i);
			
			if(ch == '(' || ch == '{' || ch == '['){
				st.push(ch);
			} else if(ch == ')'){
				if(st.peek() == '('){
					st.pop();
				} else{
					System.out.println("Brackets are Not Balanced ); ");
					return;
				}
			} else if(ch == '}'){
				if(st.peek() == '{'){
					st.pop();
				} else{
					System.out.println("Brackets are Not Balanced ); ");
					return;
				}
			} else if(ch == ']'){
				if(st.peek() == '['){
					st.pop();
				} else{
					System.out.println("Brackets are Not Balanced ); ");
					return;
				}
			} else{
				//Nothingff
			}
		}
		
		if(st.size() == 0){
			System.out.println("Brackets are Balanced (: ");
		} else{
			System.out.println("Brackets are Not Balanced ); ");
		}
		
	}
	
}