package statePattern;

public class GumballMachine {
    State winnerState;
    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;

    State state = soldOutState;
    int count = 0;

    public GumballMachine(int numberGumballs){
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);

        this.count = numberGumballs;
        if(numberGumballs > 0){
            state = noQuarterState;
        }
    }

    public void insertQuarter(){
        state.insertQuarter();
    }

    public void ejectQuarter(){
        state.ejectQuarter();
    }

    public void turnCrank(){
        state.turnCrank();
        state.dispense();
    }

    public void releaseBall(){
        System.out.println("A gumball comes rolling out the slot...");
        if(count != 0){
            count = count - 1;
        }
    }

    public State getWinnerState() {
        return winnerState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public int getCount() {
        return count;
    }

    public void setState(State state){
        this.state = state;
    }

    @Override
    public String toString() {
        if (!(state instanceof SoldOutState)) {
            return "Mighty Gumball, Inc." +
                    "\nJava-enabled Standing Gumball Model #2004" +
                    "\nInventory: " + count + " gumballs" +
                    "\nMachine is waiting for quarter\n";
        }
        else {
            return "Mighty Gumball, Inc." +
                    "\nJava-enabled Standing Gumball Model #2004" +
                    "\nInventory: " + count + " gumballs" +
                    "\nMachine is sold out\n";
        }
    }
}
