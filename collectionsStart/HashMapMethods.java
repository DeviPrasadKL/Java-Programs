package collectionsStart;

import java.util.HashMap;

public class HashMapMethods {
	public static void main(String[] args) {
		HashMap h = new HashMap();
		
//put() is used to add an Entry (Key,Value) into the Map
		h.put(100,"hello");
		h.put(1.6,null);
		h.put("hai", 37.8);
		
		System.out.println(h); //[100=hello, 1.6=null, hai=37.8]
		
//size() is used to calculate number of entries present 
		System.out.println(h.size());	//3
		
//get() will return the value based on key
//get() returns null, if the key is not present 
		System.out.println(h,get(100));		//hello
		System.out.println(h.get("NoValue"));	//null
		
//containsKey() is used to check if the key is present or not
		System.out.println(h.containsKey(1.6));		//true
//containsValue() is used to check if the value is present or not
		System.out.println(h.containsValue("Hello"));	//true
		
		System.out.println(h);	//[100=hello, 1.6=null, hai=37.8]
		h.remove(100);
		System.out.println(h);	//[1.6=null, hai=37.8]
		
//isEmpty() is used to check if the map is empty or not
		System.out.println(h.isEmpty);		//false
		
//clear() is used to remove all the Entries from the map
		h.clear();
		System.out.println(h.isEmpty());		//true
	}
}












