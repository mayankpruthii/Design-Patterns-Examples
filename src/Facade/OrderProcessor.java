package Facade;

public class OrderProcessor {
    public boolean checkIfProductAvailable(String name) {
        System.out.println("Checking product");
        return true;
    }

    public String placeOrder(String name, int qty) {
        System.out.println("Order placed");
        String orderId = "abc123";
        return orderId;
    }

    public void shipOrder(String orderId) {
        System.out.println("Product shipped");
    }
}
