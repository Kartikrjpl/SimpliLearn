package June2;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkHashMap_Demo {

	public static void main(String[] args) {
		Map <Integer, String> map1 = new LinkedHashMap<Integer, String>();
		
		map1.put(1,new String("Ram"));
		map1.put(2,new String("Shyam"));
		map1.put(3,new String("Sam"));
		map1.put(4,new String("Fam"));
		
		System.out.println("Map contains "+map1);
		
		for (Integer key : map1.keySet()) {
			System.out.println(key+" "+ map1.get(key));
			
		}
		
		System.out.println(map1.size());
		System.out.println(map1.isEmpty());
		System.out.println(map1.containsKey(2));
		System.out.println(map1.containsValue("Kartik"));
		System.out.println(map1.remove(3)); // removed with the key
		System.out.println(map1);
		map1.clear();
		System.out.println(map1);
		
		
		
		
	}
}