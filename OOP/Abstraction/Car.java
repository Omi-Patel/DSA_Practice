abstract class Body{
	
	abstract void method();
	
	public Body(){
		System.out.println("I am a Body Constructor");
	}
}

class Tyre extends Body{
	
	void method(){
		System.out.println("Body of Abstract Method...");
	}
	
	public void printMsg(){
		System.out.println("Turning Wheels...");
	}
}

class Car{
	public static void main(String[] args){
		Tyre t = new Tyre();
		
		//t.printMsg();
		
		t.method();
	}
}