package topic1;
/* There are two types of lists array lists and linked lists. Both of 
 * these implement the List interface and are almost identical, but there
 * are advantages to using each one. Array lists are much faster for
 * searching an element on a list while a LinkedList requires traversal 
 * through the array in search of the element. 
 * 
 * Linked lists are faster in deleting element and inserting elements, 
 * and ArrayLists are good for searching and memory overhead. 
 * 
 * The example provided is that of an ArrayList.
*/
import java.util.ArrayList;

public class topic1List {

	public static void main(String[] args) {
		
//		Create an array list
		ArrayList<String> myList = new ArrayList<String>();
		
//		ADD ITEMS TO A LIST
		System.out.println("Add items to an array list");
		myList.add("one");
		myList.add("two");
		myList.add("four");
		myList.add("five");
		System.out.println(myList);
		System.out.println("");
		
//		Add items to an array list by index
		System.out.println("Add items to an array list by index");
		myList.add(2, "three");
		System.out.println(myList);
		System.out.println("");
		
		
//		REMOVE ITEMS FROM A LIST
//		Remove items from an array list by object
		System.out.println("Remove items from an array list by object");
		myList.remove("one");
		System.out.println(myList);
		System.out.println("");
		
//		Remove items from an array list by index
		System.out.println("Remove items from an array list by index");
		myList.remove(3);
		System.out.println(myList);
		System.out.println("");
		
		
		
//		SET OR UPDATE ITEMS IN A LIST
		System.out.println("Update items in a list");
		myList.set(0, "zero");
		System.out.println(myList);
		System.out.println("");
		
		
		
//		RETURN THE INDEX OF AN OBJECT IN A LIST
		System.out.println("Return the index of an object in a list");
		int indexOne = myList.indexOf("zero");
		System.out.println(indexOne);
		System.out.println("");
		
		
		
//		RETURN THE OBJECT OF A LIST 
		System.out.println("Return the object of a list by index");
		String str = myList.get(1);
		System.out.println(str);
		System.out.println("");
		
		
		
//		RETURN THE SUBLIST OF A LIST 
		System.out.println("Return the sublist of a list");
		System.out.println(myList.subList(0,1));
		System.out.println("");
		
		
		
//		RETURN THE SIZE OF A LIST
		System.out.println("Return the size of a list");
		int listCount = myList.size();
		System.out.println(listCount);
		System.out.println("");
		
		
		
//		RETURN TRUE IF LIST CONTAINS OBJECT
		System.out.println("Return if a list contains an object");
		boolean contains = myList.contains("two");
		System.out.println(contains);
		System.out.println("");
		
		
//		Iterate through an array list
		System.out.println("Iterate through an array list");
		for(String item:myList)
			System.out.println(item);
		System.out.println("");
		
		
		
//		CLEAR OUT AN ARRAY LIST
		System.out.println("Clear a list");
		myList.clear();
		System.out.println(myList);
	}
	
	

}


























