// Multi Threading in Java : 

// 2 Ways : 
// i) By Extending Thread Class
// ii) By implementing Runnable interface


// i) 

class MyThread1 extends Thread{
	public void run(){		// run() method is present in the class Thread()...
		int i = 0;
		while(i < 200){
			System.out.println("I am Happy..");
			i++;
		}
	}
}

class MyThread2 extends Thread{
	public void run(){
		int i = 0;
		while(i < 400){
			System.out.println("I am very Happy..");
			i++;
		}
	}
}


class MyClass{
	public static void main(String[] args){
		MyThread1 t1 = new MyThread1();
		t1.start();			// start() method is used to call the run() method of the subclass..
		
		MyThread2 t2 = new MyThread2();
		t2.start();
	}
}