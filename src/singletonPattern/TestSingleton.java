package singletonPattern;

public class TestSingleton {
    public static void main(String[] args) {
        System.out.println("**************Singleton Pattern Demo*****************");
        System.out.println("Basic singleton");
        BasicSingleton basicSingleton = BasicSingleton.getInstance();
        System.out.println("------------------");
        System.out.println("Eagerly singleton");
        EagerlySingleton eagerlySingleton = EagerlySingleton.getInstance();
        System.out.println("------------------");
        System.out.println("Synch singleton");
        SynchSingleton synchSingleton = SynchSingleton.getInstance();
        System.out.println("------------------");
        System.out.println("Double check singleton");
        DoubleCheckSingleton doubleCheckSingleton = DoubleCheckSingleton.getInstance();

    }
}
