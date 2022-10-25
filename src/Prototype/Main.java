package Prototype;

public class Main {
    /*
     * Creational Pattern
     * Prototype allows us to hide the complexity of 
     * making new instances from the client. The 
     * concept is to copy an existing object rather 
     * than creating a new instance from scratch, 
     * something that may include costly operations. 
     * The existing object acts as a prototype and 
     * contains the state of the object. The newly 
     * copied object may change same properties only 
     * if required. This approach saves costly resources 
     * and time, especially when object creation is a 
     * heavy process.
     * PROS - can make as many objects as we want
     * CONS - circular dependencies and multi level 
     * inheritance might cause problems
     */
    public static void main(String[] args) {
        // PROBLEM - 
        // clone() method makes shallow copy, if a new object
        // of another class is made within game1 itself
        // then it will copy the same object to the clone too
        // 
        // SOLUTION - for that make deep clone copies 
        // i.e in the clone() method, make new objects there
        // so that when game2 calls clone() in game1, it makes 
        // the new object again
        // can also use copy constructors instead of clone
        
        Game game1 = new Game();
        game1.setId(1);
        game1.setName("CSGO");

        Game game2 = null;
        try {
            game2 = game1.clone();
        } catch(CloneNotSupportedException e) {
            System.err.println(e.getMessage());
        } 
        System.out.println(game1 + "\n" + game2);
    }

}
