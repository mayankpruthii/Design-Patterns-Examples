package Factory;

public class Main {
    public static void main(String[] args) {
        /* 
        creational pattern
        hides the object creation process
        responsible for creating the objects and giving it to other classes
        Example - Driver class to connect to different vendor SQL databases
        Driver can connect to OracleSQL, MySQL, SQLServer
        but you do not need to remember everything about the driver, you may
        only call the Driver API i.e Driver is a factory for SQL connection
        hides the details about finding the vendors and creates objects acccordingly
        Example#2 - PizzaStore has PizzaFactory that hides the complexity
        about preparing the type of Pizza and delivers it to PizzaStore
        PizzaStore example is discussed below
        */
        
        PizzaStore store = new PizzaStore();
        store.orderPizza("cheese");
        store.orderPizza("veggie");
        store.orderPizza("chicken");
    }
}
