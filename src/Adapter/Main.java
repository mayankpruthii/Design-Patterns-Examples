package Adapter;

public class Main {
    public static void main(String[] args) {
        /*
        When two classes communicating with each other
        Real world example - USB to C type adapter, i.e the requesting
        resource needs C type but its offering USB, so the adapter has
        to take inputs from both and communicate 
        To use an adapter:
        - The client makes a request to the adapter by calling a method on it using the target interface.
        - The adapter translates that request on the adaptee using the adaptee interface.
        - Client receive the results of the call and is unaware of adapter’s presence.
        https://www.geeksforgeeks.org/adapter-pattern/
        */
        WeatherUI ui = new WeatherUI();
        ui.showTemperature(110001);
    }
} 