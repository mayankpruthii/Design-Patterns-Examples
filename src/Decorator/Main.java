package Decorator;

public class Main {
    /*
     * Behavioral Pattern
     * The decorator pattern attaches additional responsibilities 
     * to an object dynamically. Decorators provide a flexible 
     * alternative to subclassing for extending functionality.
     * Just like Python decorators or javascript closures, can add
     * extra functionalities on the go
     * Best EXAMPLE - ExpressJS Middlewares
     * - read/write stream files in java, like ObjectOutputStream in SingleTon.Main
     */

    public static void main(String[] args) {
        Pizza pizza = new VeggiePizzaDecorator(new CheesePizzaDecorator(new PlainPizza()));
        pizza.bake();            
    }
}
