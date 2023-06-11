package commandPattern.commands;

public class NoCommand implements Command{
    public NoCommand() {
    }

    public static Command getInstance() {
        return new NoCommand();
    }

    @Override
    public void execute() {
        return;
    }

    @Override
    public void undo() {
        return;
    }
}
