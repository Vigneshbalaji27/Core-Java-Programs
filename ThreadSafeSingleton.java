package com.vikki.java8;

public class ThreadSafeSingleton {
	
    // Private constructor prevents instantiation from other classes.
    private ThreadSafeSingleton() {}

    
    // The volatile keyword ensures visibility of changes across threads
    // and prevents instruction reordering.
    private static volatile ThreadSafeSingleton instance;


    public static ThreadSafeSingleton getInstance() {
        // First check (no locking): avoids performance overhead if instance exists.
        if (instance == null) {
            // Synchronize on the class block to ensure only one thread enters.
            synchronized (ThreadSafeSingleton.class) {
                // Second check (with locking): ensures another thread didn't 
                // initialize it while this thread was waiting for the lock.
                if (instance == null) {
                    instance = new ThreadSafeSingleton();
                }
            }
        }
        return instance;
    }
}
