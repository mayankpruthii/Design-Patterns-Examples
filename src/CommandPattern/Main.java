package CommandPattern;

public class Main {
    /*
     * Behavioral Pattern
     * In command pattern there is a Command object 
     * that encapsulates a request by binding together 
     * a set of actions on a specific receiver. It does 
     * so by exposing just one method execute() that 
     * causes some actions to be invoked on the receiver.
     * https://www.geeksforgeeks.org/command-pattern/?ref=lbp
     */

    public static void main(String[] args) {
        Television television = new Television();               // instantiate receiver
        RemoteControl remoteControl = new RemoteControl();      // instantiate remote
        OnCommand onCommand = new OnCommand(television);        // instantiate action class
        remoteControl.setCommand(onCommand);                    // bind action to remote
        remoteControl.pressButton();                            // execute that action
    
        OffCommand offCommand = new OffCommand(television);
        remoteControl.setCommand(offCommand);
        remoteControl.pressButton();
    }

}
