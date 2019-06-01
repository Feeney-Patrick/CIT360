package topic1;
import java.util.TreeSet;

/* The tree is a very interesting interface, and data structure. 
 * There is no specific interface for the tree, however, it does
 * find its place in sets and maps. I will be doing examples of a
 * tree set. I don't go into the depth of a set but use a tree set
 * to demonstrate the tree. 
 * 
 * The main thing I wish to talk about the tree is the way it
 * searches through data. From what we can see from the tree set
 * compared to the hashset the tree set organizes the data. 
 * A tree receives data and organizes it. This organization enables
 * search functions involving the tree to find data much faster. 
 * It divides the data into halves. Look to the video to see 
 * an explanation. 
 */

public class topic1Tree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		         // TreeSet of String Type
		         TreeSet<String> treeSet1 = new TreeSet<String>();

		         // Adding elements to TreeSet<String>
		         treeSet1.add("ABC");
		         treeSet1.add("Orange");
		         treeSet1.add("Apple");
		         treeSet1.add("Tomato");
		         treeSet1.add("Banana");
		         treeSet1.add("Lemon");

		         //Displaying TreeSet
		         System.out.println(treeSet1);

		         // TreeSet of Integer Type
		         TreeSet<Integer> treeSet2 = new TreeSet<Integer>();

		         // Adding elements to TreeSet<Integer>
		         treeSet2.add(56);
		         treeSet2.add(1);
		         treeSet2.add(101);
		         treeSet2.add(2);
		         treeSet2.add(3);
		         treeSet2.add(22);
		         System.out.println(treeSet2);
		 
	}

}
