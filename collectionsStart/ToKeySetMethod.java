package collectionsStart;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;

public class ToKeySetMethod {
	public static void main(String[] args){
		LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();
		map.put(10, "Tom");
		map.put(20, "Jerry");
		map.put(30, "Alex");

		Set<Integer> s = map.keySet();
		for(int i : s){
			System.out.println(i+" "+map.get(i));
		}

		System.out.println("--------------------------------");

		TreeMap<String, Double> t = new TreeMap<String, Double>();
		t.put("B",3.7);
		t.put("A",1.5);
		t.put("C",2.0);

		Set<String> st = t.keySet();
		for(String key : st){
			System.out.println(key+" "+st.get(key));
		}
	}
}
