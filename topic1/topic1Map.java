package topic1;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class topic1Map {

	public static void main(String[] args) {
		
		HashMap<String, Integer> myMap1 = new HashMap<String, Integer>();
		
//		Put items in a map
		myMap1.put("Patrick", 7);
		myMap1.put("Hayley", 5);
		myMap1.put("Carl", 6);
		System.out.println(myMap1);
		System.out.println();
		
		
//		Clone a map
		System.out.println("Clone a map");
		TreeMap<String, Integer> myMap2 = new TreeMap<String, Integer>();
		myMap2.putAll(myMap1);
		System.out.println(myMap2);
		System.out.println();
		
//		Check if a map key exists
		System.out.println("Check if key has a value");
		boolean check = myMap2.containsKey("Patrick");
		System.out.println(check);
		System.out.println();

//		Check if contains a value
		System.out.println("Check if key has a value");
		check = myMap2.containsValue("Patrick");
		System.out.println(check);
		System.out.println();
		
//		Turn the map into a set
		System.out.println("Turn the map into a set");
		System.out.println(myMap2.entrySet());
		System.out.println();
		
//		Check if to maps are equal
		System.out.println("Check if to maps are equal");
		check = myMap1.equals(myMap2);
		System.out.println(check);
		System.out.println();
		
//		Get the value of a key
		System.out.println("Get the value of a key");
		System.out.println(myMap2.get("Hayley"));
		System.out.println();
		
//		Remove an object
		System.out.println("Remove an object");
		myMap2.remove("Carl");
		System.out.println(myMap2);
		System.out.println();
		
//		Get the hash code
		System.out.println("Get the hash code");
		int hash;
		hash = myMap2.hashCode();
		System.out.println(hash);
		System.out.println();
		
//		Returns the values in the map
		System.out.println("Returns the values in the map");
		System.out.println(myMap2.values());
		System.out.println();

//		Returns the keys in the map
		System.out.println("Returns the keys in the map");
		System.out.println(myMap2.keySet());
		System.out.println();
		
//		Returns the size of the map
		System.out.println("Returns the size of the map");
		System.out.println(myMap2.size());
		System.out.println();
		
//		Clear the Map
		System.out.println("Clear the Map");
		myMap2.clear();
		System.out.println(myMap2);
		System.out.println();
		
//		Check to see if map is empty
		System.out.println("Check to see if map is empty");
		check = myMap2.isEmpty();
		System.out.println(check);
		System.out.println();
		
		
		
	}

}
