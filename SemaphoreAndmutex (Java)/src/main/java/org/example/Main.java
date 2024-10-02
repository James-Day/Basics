package org.example;

import static org.example.SemaphoreExample.accessResource;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        /* Mutex
        MutexExample mutexExample = new MutexExample();

        Thread t1 = new Thread(() -> { //override run method
            for(int i = 0; i < 1000; i++){
                mutexExample.increment();
            }
        });
        Thread t2 = new Thread(() -> { //override run method
            for(int i = 0; i < 1000; i++){
                mutexExample.increment();
            }
        });
        Thread t3 = new Thread(() -> { //override run method
            for(int i = 0; i < 1000; i++){
                mutexExample.decrement();
            }
        });

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();
        System.out.println(mutexExample.getCount());
        */

        /* Semaphore
        Thread t1 = new Thread(() -> accessResource("Thread-1"));
        Thread t2 = new Thread(() -> accessResource("Thread-2"));
        Thread t3 = new Thread(() -> accessResource("Thread-3"));
        Thread t4 = new Thread(() -> accessResource("Thread-4"));
        Thread t5 = new Thread(() -> accessResource("Thread-5"));

        // Start all threads
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        */
    }
}

