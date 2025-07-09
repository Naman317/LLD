
// Product interface
interface Shape {
    void draw();
}

// Concrete products
class Circle implements Shape {
    public void draw() {
        System.out.println("Circle");
    }
}

class Square implements Shape {
    public void draw() {
        System.out.println("Square");
    }
}

// Simple Factory
class ShapeFactory {
    public static Shape create(String type) {
        switch (type) {
            case "CIRCLE":
                return new Circle();
            case "SQUARE":
                return new Square();
            default:
                throw new IllegalArgumentException("Unknown type");
        }
    }
}

// Client

public class SimpleFactory {
    public static void main(String[] args) {
        Shape s = ShapeFactory.create("CIRCLE");
        s.draw(); // prints "Circle"
    }
}
