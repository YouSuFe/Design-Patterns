package StrategyPattern;

public class FlyWithWings implements IFlyBehavior {
    @Override
    public void fly() {
        System.out.println("Flying with Wings ...");
    }
}
