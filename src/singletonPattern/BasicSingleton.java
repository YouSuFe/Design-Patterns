package singletonPattern;

public class BasicSingleton {
    private static BasicSingleton INSTANCE;
    private BasicSingleton() {
        System.out.println("Basic singleton is initializing");
    }

    public static BasicSingleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new BasicSingleton();
        }
        return INSTANCE;
    }
}
