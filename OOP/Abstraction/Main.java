interface Polygon{
	void getArea(int length, int breadth);
}

class Rectangle implements Polygon{
	
	public void getArea(int length, int breadth){
		System.out.println("Area = " + length*breadth);
	}
	
	void msg(){
		System.out.println("I am Implementing the Interface..");
	}
}

class Main{
	public static void main(String[] args){
		Rectangle r = new Rectangle();
		
		r.msg();
		r.getArea(5, 6);
	}
}