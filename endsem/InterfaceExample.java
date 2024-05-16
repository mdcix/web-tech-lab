// Define an interface named "Drawable"
interface Drawable {
    void draw(); // Method declaration without an implementation
}

// Implement the "Drawable" interface in a class
class Circle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

class Rectangle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        // Create objects of classes that implement the "Drawable" interface
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();

        // Call the "draw" method on these objects
        circle.draw();
        rectangle.draw();
    }
}
