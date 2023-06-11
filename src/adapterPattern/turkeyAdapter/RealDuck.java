package adapterPattern.turkeyAdapter;

public class RealDuck implements Duck{
    public RealDuck() {
    }

    @Override
    public void quack() {
        System.out.println("Quack!");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying!");
    }
}
