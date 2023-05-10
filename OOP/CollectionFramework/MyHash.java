// HashSet in java..
// It stores the unique elements..
// For more Operation.. Visit Programiz
// There are also LikedHashSet and TreeSet are present which works same as the HashSet..

import java.util.*;

class MyHash{
	public static void main(String[] args){
		
		HashSet<Integer> map = new HashSet<>();
		
		map.add(2);
		map.add(4);
		map.add(6);
		map.add(6);
		
		HashSet<Integer> map2 = new HashSet<>();
		map2.add(1);
		map2.add(3);
		
		map.addAll(map2);
		
		System.out.println(map);
		
		//map.remove(6);
		map.removeAll(map2);
		
		System.out.println(map);
		
		
		// Using Iterator
		
		Iterator<Integer> it = map.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}