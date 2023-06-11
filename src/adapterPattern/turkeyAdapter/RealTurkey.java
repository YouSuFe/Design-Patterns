package adapterPattern.turkeyAdapter;

public class RealTurkey implements Turkey{

    public RealTurkey() {
    }

    @Override
    public void gobble() {
        System.out.println("Gobble!");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying a short distance!");
    }
}
