package abstractFactoryPattern;

import abstractFactoryPattern.ingredients.*;

public class ChicagoPizzaIngredientFactory implements IPizzaIngredientFactory{

    @Override
    public IDough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public ISauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public ICheese createCheese() {
        return new MozarellaCheese();
    }

    @Override
    public IClams createClams() {
        return new FrozenClams();
    }
}
