package Flyweight;

public class PaintApp {
    public void render(int numberOfShapes) {
        Shape shape = null;
        for (int i = 0; i < numberOfShapes; i++) {
            if(i % 2 == 0) {
                shape = ShapeFactory.getShape("circle");
                shape.draw(i, "red", "white");
            } else {
                shape.draw(i, i * 2, "dotted");
            }
        }        
    }
}
