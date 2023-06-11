package templateMethodPattern;

public abstract class CaffeineBeverage {
    final void prepare() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments())
            addCondiments();
    }
    // This is the template method
    abstract void brew();

    // This is the template method
    abstract void addCondiments();

    final void boilWater() {
        System.out.println("Boiling water");
    }

    final void pourInCup() {
        System.out.println("Pouring in cup");
    }

    // This is a hook
    boolean customerWantsCondiments() {
        return true;
    }

}
