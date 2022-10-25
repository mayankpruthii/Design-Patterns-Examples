package Factory;

public class PizzaStore {

    public void orderPizza(String type) {
        Pizza p = PizzaFactory.getPizzaType(type);

        p.prepare();
        p.bake();
        p.cut();
        System.out.println("\n");
    }
}
