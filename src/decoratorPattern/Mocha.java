package decoratorPattern;

public class Mocha extends CondimentDecarator{
    Beverage beverage;      // This is the instance variable to hold the beverage we are wrapping

    // A way to set this instance variable to the object we are wrapping
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    // Add cost of mocha to the beverage and delegate the call to the object we are wrapping
    @Override
    public double cost() {
        return 0.2 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }
}
