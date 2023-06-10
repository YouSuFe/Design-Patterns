package singletonPattern;

public class DoubleCheckSingleton {
    // This is a volatile variable, which means that it is not cached in any thread.
    // All reads and writes are done to and from the main memory.
    private volatile static DoubleCheckSingleton INSTANCE;

    private DoubleCheckSingleton() {
        System.out.println("Double check singleton is initializing");
    }

    // This is a double-checked singleton, which means that it is checked twice to ensure that it is null or not
    public static DoubleCheckSingleton getInstance() {
        if(INSTANCE == null){
            synchronized (DoubleCheckSingleton.class){
                if(INSTANCE == null){
                    INSTANCE = new DoubleCheckSingleton();
                }
            }
        }
        return INSTANCE;
    }
}
