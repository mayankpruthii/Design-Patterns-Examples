package Flyweight;

public class Main {
    public static void main(String[] args) {
        /*
         * Structural Design pattern
         * This pattern provides ways to decrease object count thus 
         * improving application required objects structure. Flyweight 
         * pattern is used when we need to create a large number of 
         * similar objects (say 105). One important feature of flyweight 
         * objects is that they are immutable. This means that they 
         * cannot be modified once they have been constructed.
         * https://www.geeksforgeeks.org/flyweight-design-pattern/
         */

         PaintApp app = new PaintApp();
         app.render(10);
    }
}
