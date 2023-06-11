package adapterPattern;

import adapterPattern.turkeyAdapter.RealDuck;
import adapterPattern.turkeyAdapter.RealTurkey;
import adapterPattern.turkeyAdapter.TurkeyAdapter;

public class TestAdapter {
    public static void main(String[] args) {
        RealDuck realDuck = new RealDuck();
        TurkeyAdapter turkeyAdapter = new TurkeyAdapter(new RealTurkey());
        System.out.println("The Duck says:");
        realDuck.quack();
        realDuck.fly();
        System.out.println("The TurkeyAdapter says:");
        turkeyAdapter.quack();
        turkeyAdapter.fly();
    }
}
