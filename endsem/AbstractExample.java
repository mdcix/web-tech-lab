// Abstract class
abstract class Shape {
    // Abstract method without an implementation
    public abstract void draw();
    
    // Regular method with an implementation
    public void area() {
        System.out.println("Calculating the area of a shape");
    }
}

// Concrete subclass 1
class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

// Concrete subclass 2
class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}

public class AbstractExample {
    public static void main(String[] args) {
        // Create instances of concrete subclasses
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();

        // Call the "draw" method on each object
        circle.draw();
        rectangle.draw();
        
        // Call the "area" method on each object
        circle.area();
        rectangle.area();
    }
}
