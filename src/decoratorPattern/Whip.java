package decoratorPattern;

public class Whip extends CondimentDecarator{
    Beverage beverage;      // Instance variable to hold the beverage we are wrapping

    // A way to set this instance variable to the object we are wrapping
    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    // Add cost of whip to the beverage and delegate the call to the object we are wrapping
    @Override
    public double cost() {
        return 0.1 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }
}
