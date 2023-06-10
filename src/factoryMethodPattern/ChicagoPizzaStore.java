package factoryMethodPattern;

public class ChicagoPizzaStore extends PizzaStore{

    // The ChicagoPizzaStore is a concrete creator that extends the abstract PizzaStore class.
    @Override
    Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        }
        else if (type.equals("clam")) {
            return new ChicagoStyleClamPizza();
        }
        else return null;
    }
}
