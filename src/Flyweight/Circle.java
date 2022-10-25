package Flyweight;

public class Circle extends Shape {
    private String label;

    public Circle() {
        label = "circle";
    }
    
    @Override
    public void draw(int radius, String fillColor, String lineColor) {
        System.out.println("Drawing a " + label + " with radius " + radius + " Fill color: " + fillColor + " Line Color: " + lineColor);
    }
}
