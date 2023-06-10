package decoratorPattern;

public class Soy extends CondimentDecarator{
    Beverage beverage;      // Instance variable to hold the beverage we are wrapping

    // A way to set this instance variable to the object we are wrapping
    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    // Add cost of soy to the beverage and delegate the call to the object we are wrapping
    @Override
    public double cost() {
        return 0.15 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }
}
