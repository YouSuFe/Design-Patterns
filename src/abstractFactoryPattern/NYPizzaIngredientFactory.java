package abstractFactoryPattern;

import abstractFactoryPattern.ingredients.*;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new RagglanoCheese();
    }

    @Override
    public Clams createClams() {
        return new FreshClams();
    }
}
