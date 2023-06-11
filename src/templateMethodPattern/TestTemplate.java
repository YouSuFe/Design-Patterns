package templateMethodPattern;

public class TestTemplate {
    public static void main(String[] args) {
        System.out.println("********************* Template Method Pattern Demo *********************");
        Tea tea = new Tea();
        Coffee coffee = new Coffee();
        CoffeeWithHook coffeeHook = new CoffeeWithHook();

        System.out.println("\nMaking tea...");
        tea.prepare();

        System.out.println("\nMaking coffee...");
        coffee.prepare();

        System.out.println("\nMaking coffee with hook...");
        coffeeHook.prepare();
    }
}
