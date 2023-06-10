package factoryMethodPattern;

public class NYPizzaStore extends PizzaStore{
    // The NYPizzaStore is a concrete creator that extends the abstract PizzaStore class.
    @Override
    Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new NYStyleCheesePizza();
        }
        else if (type.equals("clam")) {
            return new NyStyleClamPizza();
        }
        else return null;
    }
}
