package abstractFactoryPattern;

import abstractFactoryPattern.pizzas.Pizza;

public class TestAbstract {
    public static void main(String[] args) {
        System.out.println("**************************Test Abstract Factory Pattern Demo**************************");
        PizzaStore nyStore = new NyPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();
        nyStore.orderPizza("cheese");
        System.out.println("-------------------------------------------------------------------------------------");
        chicagoStore.orderPizza("cheese");
        System.out.println("-------------------------------------------------------------------------------------");
        nyStore.orderPizza("clam");

    }
}
