// HashMap in Java..
// It stores the data in Key : Value pair
// For the Operation of the HashMap , refers Programiz.


import java.util.*;
class MyHashMap{
	public static void main(String[] args){
		
		// We are making .. <"name" : age>
		
		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("Om" , 20);
		map.put("Dhruv" , 22);
		map.put("Abc" , 22);
		
		map.replace("Abc", 19);
		
		System.out.println(map.entrySet());
		
		
		
		System.out.println(map.keySet());
	}
}