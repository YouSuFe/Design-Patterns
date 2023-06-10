package factoryMethodPattern;

public class NyStyleClamPizza extends Pizza{
    public NyStyleClamPizza() {
        name = "NY Style Clam Pizza";
        dough = "Thin Crust Dough";
        sauce ="Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
    }
}
