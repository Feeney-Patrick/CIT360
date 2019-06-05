package threadables;

import java.util.concurrent.atomic.AtomicInteger;

class threadAtomic {
	
    private AtomicInteger counter = new AtomicInteger(0);

    public void increment() {
    	counter.incrementAndGet();
    }

    public void decrement() {
    	counter.decrementAndGet();
    }

    public int value() {
        return counter.get();
    }

}