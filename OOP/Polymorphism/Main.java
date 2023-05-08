// Java Polymorphism...
// In this concept : SubClasses Do Their Work Individually which is extends from SuperClass 


class Animal{
	public void speak(){
		System.out.println("Animal Sound...");
	}
}

class Pig extends Animal{
	public void speak(){
		System.out.println("Wee Wee...");
	}
}

class Dog extends Animal{
	public void speak(){
		System.out.println("How Bow...");
	}
}

class Main{
	public static void main(String[] args){
		Animal pig = new Pig();		// Actual Object 'pig' of SubClass 'Pig' is refferencing from SuperClass
		pig.speak();				// Access Only methods which is in the Pig() class...
		
		Animal a = new Animal();
		a.speak();
	}
}