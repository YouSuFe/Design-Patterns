package singletonPattern;

public class EagerlySingleton {
    // This is an eagerly initialized singleton, which means that it is initialized when the class is loaded.
    private static EagerlySingleton INSTANCE = new EagerlySingleton();

    private EagerlySingleton() {
        System.out.println("Eagerly singleton is initializing");
    }

    public static EagerlySingleton getInstance() {
        return INSTANCE;
    }
}
