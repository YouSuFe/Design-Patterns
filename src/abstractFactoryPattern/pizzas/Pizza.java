package abstractFactoryPattern.pizzas;

import abstractFactoryPattern.ingredients.ICheese;
import abstractFactoryPattern.ingredients.IClams;
import abstractFactoryPattern.ingredients.IDough;
import abstractFactoryPattern.ingredients.ISauce;

public abstract class Pizza {
    protected String name;
    protected IDough dough;
    protected ISauce sauce;
    protected ICheese cheese;
    protected IClams clams;

    public abstract void prepare();

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", dough=" + dough +
                ", sauce=" + sauce +
                ", cheese=" + cheese +
                ", clams=" + clams +
                '}';
    }
}
