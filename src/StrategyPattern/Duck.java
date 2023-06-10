package StrategyPattern;

public abstract class Duck
{
    IFlyBehavior flyBehavior;
    IQuackBehavior quackBehavior;

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

    public void setFlyBehavior(IFlyBehavior flyBehav)
    {
        this.flyBehavior = flyBehav;
    }

    public void setQuackBehavior(IQuackBehavior quackBehav)
    {
        this.quackBehavior = quackBehav;
    }

    public abstract void display();
}
