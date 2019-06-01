package topic1;

import java.util.HashSet;



/* A Set is a Collection that cannot contain duplicate elements. 
*  It models the mathematical set abstraction. 
*  Set also adds a stronger contract on the behavior of the equals and 
*  hashCode operations, allowing Set instances to be compared
*  meaningfully even if their implementation types differ.
*  TreeSets unlike HashSets do maintain order of the items in the collection
*  In this example the HashSet was setup organized, however, if it weren't
*  the HashSet would not have organized it while the TreeSet would have
*  
*  Things to note:
*  		 If you want a sorted Set then it is better to add elements to 
*  		 HashSet and then convert it into TreeSet rather than creating a 
* 		 TreeSet and adding elements to it.
*/

public class topic1Set {

	public static void main(String[] args) {
		
		HashSet<Integer> mySet1 = new HashSet<Integer>();
		
		// 4,1,10,6,65,30
		
		for(int i = 0;i < 9;i++) {
			mySet1.add(i);
		}

		System.out.println(mySet1);
		System.out.println();
		
//		Adding an element which already exists in the set cannot be done
		System.out.println("Adding an element which already exists in the set");
		mySet1.add(8);
		System.out.println(mySet1);
		System.out.println();
		
		//Null values can also be added to a set unlike other collections
		System.out.println("Null values can be added");
		mySet1.add(null);
		System.out.println(mySet1);
		System.out.println();
		
//		Remove object from set
		System.out.println("Remove object from set");
		mySet1.remove(5);
		System.out.println(mySet1);
		System.out.println();
		
		
//		Check if an object exists in the Set
		System.out.println("Check if object exists in set");
		boolean check = mySet1.contains(5);
		System.out.println(check);
		System.out.println();
		
		
		//Clearing the Set
		System.out.println("Clearing the set");
		mySet1.clear();
		System.out.println(mySet1);
		System.out.println();
			
//		Check if the set is empty
		System.out.println("Check if the set is empty");
		check = mySet1.isEmpty();
		System.out.println(check);
		
		
	}

}
