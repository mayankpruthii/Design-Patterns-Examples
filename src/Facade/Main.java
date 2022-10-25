package Facade;

public class Main {
    /*
     * Creational Pattern
     * Best used for abstraction
     * It's a layer in between client and the business logic
     * basically hides the logic and provides a single api
     * 
     * In this example its only one class, this could have been
     * 3 different classes or more
     */

    public static void main(String[] args) {
        OrderFacade facade = new OrderFacade();
        facade.processOrder("macbook", 3);
    }
}
