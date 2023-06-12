package statePattern;

public class TestState {
    public static void main(String[] args) {
        System.out.println("********************* State Pattern Demo *********************");
        GumballMachine gumballMachine = new GumballMachine(5);
        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        System.out.println();

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        System.out.println();

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        System.out.println();

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        System.out.println();

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);
    }
}
