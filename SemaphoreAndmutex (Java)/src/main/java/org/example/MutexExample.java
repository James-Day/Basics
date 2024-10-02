package org.example;

class MutexExample {
    // A shared resource
    private int count = 0;

    // Method that increments the count (critical section)
    public void increment()  {
        // The synchronized block ensures that only one thread can execute this block at a time
        synchronized (this) { //if removed, you get race conditions.
            //System.out.println(Thread.currentThread().getName());
            count++;
        }
    }

    public void decrement() {
        // The synchronized block ensures that only one thread can execute this block at a time
        synchronized (this) { //This is the object that is locked. if you want you can lock a specific resource
            //System.out.println(Thread.currentThread().getName());
            count--;
        }
    }

    // Method to get the count
    public int getCount() {
        return count;
    }
}
