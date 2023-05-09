// Multi Threading in Java : 

// 2 Ways : 
// i) By Extending Thread Class
// ii) By implementing Runnable interface

// ii) 

class Om implements Runnable{
	public void run(){
		int i = 0; 
		while(i < 400){
			System.out.println("Hii.. I am Om Patel");
			i++;
		}
	}
}

class Dhruv implements Runnable{
	public void run(){
		int i = 0; 
		while(i < 40){
			System.out.println("I am Dhruv");
			i++;
		}
	}
}

class MyClass2{
	public static void main(String[] args){
		Om o = new Om();
		Thread t1 = new Thread(o);	// It is a Design to execute the run() method using start()..
		// Now we can Apply start()
		t1.start();
		
		Dhruv d = new Dhruv();
		Thread t2 = new Thread(d);
		
		t2.start();
	}
}


// Thread Priority In Java..

// Default -> 5
// Max -> 10
// Min -> 1

// From the above example..
// t1.setPriority(Thread.MIN_PRIORITY)

// t1.setPriority(Thread.MAX_PRIORITY)