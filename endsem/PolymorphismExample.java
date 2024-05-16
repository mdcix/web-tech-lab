// Parent class (superclass)
class Shape {
    public void draw() {
        System.out.println("Drawing a shape");
    }
}

// Child class 1 (subclass)
class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

// Child class 2 (subclass)
class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        // Create instances of the different shape classes
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();

        // Call the "draw" method on each object, demonstrating polymorphism
        circle.draw();     // Calls the "draw" method of the Circle class
        rectangle.draw();  // Calls the "draw" method of the Rectangle class
    }
}
