package threadables;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicInteger;

import org.w3c.dom.css.Counter;

/*
* There are two ways to use "Runnable" method. Either from
* implementing the Runnable interface in this example or by extending 
* a subclass from thread and using the run method from that class.
* This runnable allows us to use more than one thread from the CPU or
* in other words use more than one core from the CPU and run more than 
* one process at any time.
* 
* In this example I will be extending the Thread class and using a fixed
* thread pool to explain how one can complete multiple process at any time.
* 
*/

class testThread extends Thread{

	/*
	 * >>>>>>>>>>>>>>>>>>>>>>>>
	 * >>>>>>>>>>>>>>>>>>>>>
	 * I put run here
	 */
	public void run() {

		
		//Get the number of available cores.
		int CCount = Runtime.getRuntime().availableProcessors();
		//Showing the number of cores.
		System.out.println("I only have " + CCount + " cores!");
		
//		Create an atomic variable
		AtomicCounter atomicCounter = new AtomicCounter();
		
//		Create the fixed pool
		ThreadPoolExecutor TPool = (ThreadPoolExecutor) Executors.newFixedThreadPool(CCount);

		/*When the Thread Pool is run the first Tasks are put in
		 * depending on how soon the task must be run. These are
		 * place in order in the queue and then moved into the pool
		 * until the pool is full. The rest of the tasks wait in
		 * an LinkedBlockingQueue until there is room in the pool
		 * and then the open thread is then filled with the next
		 * up task.
		 * 
		 * Notice once the program runs the tasks are printed in 
		 * a random order. Run the program again and see how the
		 * order changes. This is due to which threads are 
		 * finishing the task first and taking on another one.
		 */
		
		
		for (int i = 0; i < 20; i++) {
			
			if(i%5 == 0) {
				//Make the thread wait before executing
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("The system waited to run this program");
				TPool.execute(new Task());
			}
			if(i == 9) {
				System.out.println("pool size: " + TPool.getPoolSize());
				System.out.println("core pool size:" + TPool.getCorePoolSize());
				System.out.println("active task: " + TPool.getActiveCount());
				System.out.println("completed count: " + TPool.getCompletedTaskCount());
				System.out.println("task #: " + TPool.getTaskCount());
				System.out.println("is shutdown: " + TPool.isShutdown());
				System.out.println("is terminated: " + TPool.isTerminated());
			}
			if(i == 6) {
				//Run a callable instead of the runnable
				Future<Integer> future = TPool.submit(new Work());
				try {
					int result = future.get();
					System.out.println("Returning a number using a callable: " + result);
				} catch (ExecutionException | InterruptedException e) {
					e.printStackTrace();
				};
			}
			if(i == 18) {
				//Shutdown the thread pool. If not it will stay open.
				// The rest of the tasks are rejected and an exception 
				//is sent
				TPool.shutdown();
			}
			try {
				TPool.execute(new Task());
				TPool.submit(() -> atomicCounter.incrementAndGet());
			} catch(RejectedExecutionException e) {
				System.err.println("Task Rejected! We are using the abort policy!");
			}
			
		}
		
		

		System.out.println();
		System.out.println("Even the atomic counter runs through multiple threads it still returns correctly");
		System.out.println("Final atomic count is: " + atomicCounter.getCount());
		System.out.println("This is correct because we only go through 18 of the threads!");
		
	}
}

/*
 * I moved the main class extended Thread and called the testThread method which is run
 * >>>>>>>>>>>>>>>>>>>>>>>>>
 * >>>>>>>>>>>>>>>>>>>>>>
 * >>>>>>>>>>>>>>>>>>>>>
 */
	public class myThread extends Thread {
		public static void main(String[] args){
			testThread thread1 = new testThread();
			thread1.start();
	}
		
	}
	
//Create a task for the CPU to run
	class Task implements Runnable {
		
		public void run() {
			System.out.println("Thread: " + Thread.currentThread().getName());
		}
	}
	
	class Work implements Callable<Integer> {
		@Override
		public Integer call() throws Exception {
			return 10;
		}
	}
	
	class AtomicCounter {
	    private AtomicInteger count = new AtomicInteger(0);

	    public int incrementAndGet() {
	        return count.incrementAndGet();
	    }

	    public int getCount() {
	        return count.get();
	    }
	}
