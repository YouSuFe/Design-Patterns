package abstractFactoryPattern;

import abstractFactoryPattern.ingredients.Cheese;
import abstractFactoryPattern.ingredients.Clams;
import abstractFactoryPattern.ingredients.Dough;
import abstractFactoryPattern.ingredients.Sauce;

public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Clams createClams();
}
