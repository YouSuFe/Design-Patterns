package factoryMethodPattern;

public abstract class PizzaStore {
    public Pizza orderPizza(String type) {
        Pizza pizza = null;

        // The orderPizza() method now does not need to know how to create the pizza, it just knows how to use it.
        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    // The createPizza() method is abstract, so the subclasses are forced to implement it.
    abstract Pizza createPizza(String type);
}
