package Facade;

public class OrderFacade {
    
    public void processOrder(String name, int qty) {
        OrderProcessor orderProcessor = new OrderProcessor();
        if(orderProcessor.checkIfProductAvailable(name)) {
            String orderId = orderProcessor.placeOrder(name, 2);
            orderProcessor.shipOrder(orderId);
        }
    }
}
