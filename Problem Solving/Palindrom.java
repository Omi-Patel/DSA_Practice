class Palindrom{
	public static void main(String[] args){
		String org = "omi";

		int ln = org.length();
		
		String rv = "";
		
		for(int i=ln-1; i>=0; i--){
			rv = rv + org.charAt(i);
		}
		if(rv.equals(org)){
			System.out.println("Palindrom");
		}else{
			System.out.println("Not Palindrom");
		}
	}
}