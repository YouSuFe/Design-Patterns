package strategyPattern;

public class Quack implements IQuackBehavior{
    @Override
    public void quack() {
        System.out.println("Quack!!");
    }
}
