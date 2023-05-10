// Collection Framework in java..
// Use wikipedia for hirearchi..

// Collection Interface...(Super)
// -> Set
// -> List  => ArrayList, => Vector, => Stack
// -> Queue

import java.util.*;

class Main{
	public static void main(String[] args){
		// List<Integer> l1 = new List<>();  // Throws an Error.
		// We can not create an Object of List bcz 'List' is an Interface.. 'List' implements from 'Collections' Interface.
		
		// TO Use the 'List', we make the object of the Collection Framework...
		
		// NOTE : Collection Interface & Collection Framework both are different..
		
		List<Integer> l1 = new ArrayList<>(); // Here ArrayList is a Collection Framework
		List<Integer> l2 = new ArrayList<>();
		
		// To add the elements : 
		
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		l1.add(5);
		
		l2.add(10);
		l2.add(15);
		l2.add(20);
		
		l1.addAll(l2);
		
		// To Remove the elements
		l1.remove(1);  // (index)
		
		System.out.println(l1);
	}
}


// We can also create the object of the collection framework ..

// ArrayList<Integer> a1 = new ArrayList<>(); -> This is also possible.