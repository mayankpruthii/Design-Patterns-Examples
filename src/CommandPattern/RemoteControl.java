package CommandPattern;

public class RemoteControl {
    private Command command;

    public void pressButton() {
        command.execute();
    }

    public Command getCommand() {
        return this.command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

}
