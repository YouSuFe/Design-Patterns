package factoryMethodPattern;

public class TestFactory {
    public static void main(String[] args) {
        System.out.println("***********************Factory Method Pattern Demo***********************");
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();
        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("-----------------------");

        pizza = nyStore.orderPizza("clam");
        System.out.println("-----------------------");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("-----------------------");

        pizza = chicagoStore.orderPizza("clam");


    }
}
