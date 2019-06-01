package topic1;

import java.util.PriorityQueue;
import java.util.Queue;


/*
 * A Queue is designed in such a way so that the elements added 
 * to it are placed at the end of Queue and removed from the 
 * beginning of Queue. The concept here is similar to the queue we 
 * see in our daily life, for example, when a new iPhone launches 
 * we stand in a queue outside the apple store, whoever is added
 * to the queue has to stand at the end of it and persons are served 
 * on the basis of FIFO (First In First Out), The one who gets the 
 * iPhone is removed from the beginning of the queue.
 */
public class topic1Queue {

	public static void main(String[] args) {

		Queue<String> q = new PriorityQueue();
		
		q.add("Ben");
		q.add("Dave");
		q.add("Hector");
		q.add("Tom");
		q.add("Carl");
		q.add("Jess");
		
		System.out.println("The queue " + q);
		System.out.println();
		
		System.out.println("Remove first element in queue " + q.remove());
		System.out.println();
		System.out.println("The queue " + q);
		System.out.println();
		System.out.println("The head of the queue " + q.element());
		System.out.println();
		System.out.println("Remove and return the head: " + q.poll());
		System.out.println();
		System.out.println("The queue " + q);
		System.out.println();
		System.out.println("Like the elemenet() but can return null " + q.peek());
		
		
	}

}
