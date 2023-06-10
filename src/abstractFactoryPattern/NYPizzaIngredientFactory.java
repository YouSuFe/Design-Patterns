package abstractFactoryPattern;

import abstractFactoryPattern.ingredients.*;

public class NYPizzaIngredientFactory implements IPizzaIngredientFactory {
    @Override
    public IDough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public ISauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public ICheese createCheese() {
        return new RagglanoCheese();
    }

    @Override
    public IClams createClams() {
        return new FreshClams();
    }
}
