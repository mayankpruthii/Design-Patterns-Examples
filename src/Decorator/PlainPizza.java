package Decorator;

public class PlainPizza implements Pizza {
    @Override
    public void bake() {
        System.out.println("Baking plain pizza");
    }
}
