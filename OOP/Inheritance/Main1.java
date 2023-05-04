class Phone{
	Phone(){
		System.out.println("Non-Parameterized Constructor of Phone..");
	}
	
	Phone(String type){
		System.out.println("Parameterized Constructor of Phone..");
		System.out.println("Type : " + type);
	}
	
	public void name(){
		System.out.println("I am a Phone..");
	}
}

class SmartPhone extends Phone{
	
	SmartPhone(){
		super("OPPO");
		System.out.println("Non-Parameterized Constructor of SmartPhone..");
	}
	
	//@Override
	public void name(){
		super.name();
		System.out.println("I am a SmartPhone..");
	}
}

class Main1{
	public static void main(String[] args){
		//Phone p = new Phone("iPhone");
		//p.name();
		
		SmartPhone sp = new SmartPhone();
		sp.name();
		
	}
}