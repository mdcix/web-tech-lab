class Counter {
    private int count = 0;      //Default value of count is 0

    public synchronized void increment() {
        count++;
        System.out.println(Thread.currentThread().getName() + " incremented count to: " + count);
    }

    public int getCount() {
        return count;
    }
}

class IncrementThread extends Thread {
    private Counter counter;

    public IncrementThread(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            counter.increment();
        }
    }
}

public class ThreadIncrementExample {
    public static void main(String[] args) {
        Counter counter = new Counter();

        // Create and start multiple threads to increment the counter
        Thread thread1 = new IncrementThread(counter);
        Thread thread2 = new IncrementThread(counter);
        Thread thread3 = new IncrementThread(counter);

        thread1.start();
        thread2.start();
        thread3.start();

        // Wait for all threads to finish
        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print final count value
        System.out.println("Final Count: " + counter.getCount());
    }
}
