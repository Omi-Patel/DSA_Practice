class Animal{
	
	//Constructor of Super Class
	Animal(){
		System.out.println("I am in the Constructor of Super Class..");
	}
	
	public void print(){
		System.out.println("I am an Animal");
	}
}


//Inheriting the Animal
class Dog extends Animal{
	
	Dog(){
		System.out.println("I am in the Constructor of Sub Class");
	}
	
	public void msg(){
		System.out.println("I am a Dog");
	}
}


class OOP{
	public static void main(String[] args){
		Animal a = new Animal();
		//a.print();
		
		//Dog d = new Dog();
		//d.msg();
	}
}