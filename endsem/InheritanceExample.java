// Parent class (superclass)
class Animal {
    String name;
    
    public Animal(String name) {
        this.name = name;
    }
    
    public void eat() {
        System.out.println(name + " is eating.");
    }
    
    public void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

// Child class (subclass)
class Dog extends Animal {
    public Dog(String name) {
        super(name); // Call the constructor of the superclass
    }
    
    public void bark() {
        System.out.println(name + " is barking.");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        // Create an instance of the Dog class
        Dog myDog = new Dog("Buddy");
        
        // Access the inherited methods from the Animal class
        myDog.eat();
        myDog.sleep();
        
        // Access the unique method of the Dog class
        myDog.bark();
    }
}
