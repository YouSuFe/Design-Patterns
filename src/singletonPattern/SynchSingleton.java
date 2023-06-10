package singletonPattern;

public class SynchSingleton {
    private static SynchSingleton INSTANCE;
    private SynchSingleton() {
        System.out.println("Synch singleton is initializing");
    }

    // This is a synchronized method, which means that only one thread can access it at a time.
    public static synchronized SynchSingleton getInstance(){
        if(INSTANCE == null)
            INSTANCE = new SynchSingleton();
        return INSTANCE;
    }
}
