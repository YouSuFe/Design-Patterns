package decoratorPattern;

public class Milk extends CondimentDecarator {
    Beverage beverage;  // instance variable to hold the beverage we are wrapping

    // A way to set this instance variable to the object we are wrapping
    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    // Add cost of milk to the beverage and delegate the call to the object we are wrapping
    @Override
    public double cost() {
        return 0.15 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }
}
