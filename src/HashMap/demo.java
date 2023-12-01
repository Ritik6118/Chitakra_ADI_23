package HashMap;

import java.util.*;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		TreeMap<Integer,Integer> map=new TreeMap<>();
////		O(1) insert
//		map.put(1, 5);
//		map.put(2, 5);
//		map.put(15, 5);
//		map.put(45, 5);
//		map.put(38, 5);
//		map.put(12, 5);
////		map.remove(12);
//		System.out.println(map);
//		
//		System.out.println(map.get(11));// O(1)
//		
//		System.out.println(map.containsKey(15)); //O(1)
//		System.out.println(map.containsValue(5)); //O(n)
//		
	
//		LinkedHashMap<Integer,Integer> map=new LinkedHashMap<>();
////		O(1) insert
//		map.put(1, 5);
//		map.put(2, 5);
//		map.put(15, 5);
//		map.put(45, 5);
//		map.put(38, 5);
//		map.put(12, 5);
////		map.remove(12);
//		System.out.println(map);
//		
////		System.out.println(map.get(11));// O(1)
////		
////		System.out.println(map.containsKey(15)); //O(1)
////		System.out.println(map.containsValue(5)); //O(n)
////		

		
		int[] arr= {111,11,1,1,1,1,1,111,1,1,1,1,111,1,1,1,1111};
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i:arr) {
			if(map.containsKey(i)) {
				map.put(i, map.get(i)+1);
			}
			else {
				map.put(i, 1);
			}
		}
		System.out.println(map);
		for(int i:map.keySet()) {
			System.out.println(i+" "+map.get(i));
		}
	}
}
