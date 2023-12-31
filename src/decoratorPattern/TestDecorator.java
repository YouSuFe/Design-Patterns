package decoratorPattern;

public class TestDecorator {
    public static void main(String[] args) {
        System.out.println("**********************Decorator Pattern Demo**********************");
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $"+ beverage.cost());

        System.out.println("------------------------------------------------------------------");
        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

        System.out.println("------------------------------------------------------------------");
        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Milk(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
    }
}
