package org.example;

import java.util.concurrent.Semaphore;

public class SemaphoreExample {

    // Create a semaphore that allows up to 2 threads to access the critical section simultaneously
    private static final Semaphore semaphore = new Semaphore(2);

    // Simulating a task that multiple threads will try to access
    public static void accessResource(String threadName) {
        try {
            // Acquire a permit before entering the critical section
            semaphore.acquire();
            System.out.println(threadName + " has acquired a permit.");

            // Simulating some work
            Thread.sleep(2000);

            System.out.println(threadName + " is releasing the permit.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            // Release the permit when done
            semaphore.release();
        }
    }
}
