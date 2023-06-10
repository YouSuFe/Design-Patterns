package abstractFactoryPattern;

import abstractFactoryPattern.ingredients.ICheese;
import abstractFactoryPattern.ingredients.IClams;
import abstractFactoryPattern.ingredients.IDough;
import abstractFactoryPattern.ingredients.ISauce;

public interface IPizzaIngredientFactory {
    public IDough createDough();
    public ISauce createSauce();
    public ICheese createCheese();
    public IClams createClams();
}
