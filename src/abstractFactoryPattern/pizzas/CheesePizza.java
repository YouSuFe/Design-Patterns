package abstractFactoryPattern.pizzas;

import abstractFactoryPattern.IPizzaIngredientFactory;

public class CheesePizza extends Pizza {
    IPizzaIngredientFactory ingredientFactory;

    public CheesePizza(IPizzaIngredientFactory ingrFact){
        this.ingredientFactory = ingrFact;
    }

    public void prepare(){
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        clams = ingredientFactory.createClams();
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "CheesePizza{" +
                "name='" + name + '\'' +
                ", dough=" + dough +
                ", sauce=" + sauce +
                ", cheese=" + cheese +
                ", clams=" + clams +
                '}';
    }
}
