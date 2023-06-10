package abstractFactoryPattern.pizzas;

import abstractFactoryPattern.IPizzaIngredientFactory;

public class ClamPizza extends Pizza {
    IPizzaIngredientFactory ingredientFactory;

    public ClamPizza(IPizzaIngredientFactory ingFac){
        this.ingredientFactory = ingFac;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        clams = ingredientFactory.createClams();
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "ClamPizza{" +
                "name='" + name + '\'' +
                ", dough=" + dough +
                ", sauce=" + sauce +
                ", cheese=" + cheese +
                ", clams=" + clams +
                '}';
    }
}
