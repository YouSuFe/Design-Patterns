package strategyPattern;

public abstract class Duck
{
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public void swim()
    {
        System.out.println("I can swim!");
    }

    public void performQuack()
    {
        quackBehavior.quack();
    }

    public void performFly()
    {
        flyBehavior.fly();
    }

    public void setFlyBehavior(FlyBehavior flyBehav)
    {
        this.flyBehavior = flyBehav;
    }

    public void setQuackBehavior(QuackBehavior quackBehav)
    {
        this.quackBehavior = quackBehav;
    }

    public abstract void display();
}
