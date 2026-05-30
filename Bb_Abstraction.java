// Abstraction in Java is a fundamental object-oriented programming concept that allows you to hide the implementation details of a class and only expose the essential features to the user. It helps in reducing complexity and increasing reusability. In Java, abstraction can be achieved using abstract classes and interfaces.

// Example of abstraction

abstract class Animal{
    abstract void walk(); // Abstract method, no implementation
    public void eat() { // Concrete method with implementation
        System.out.println("This animal eats food."); // Concrete method that can be used by all subclasses
    }
}
class Dog extends Animal{
    @Override
    void walk() { // Providing implementation for the abstract method
        System.out.println("The dog walks on four legs."); // Implementing the abstract method
    }
}
class Cat extends Animal{
    @Override
    void walk() { // Providing implementation for the abstract method
        System.out.println("The cat walks on four legs."); // Implementing the abstract method
    }
}

public class Bb_Abstraction{
    public static void main(String[] args) {
        Dog dog = new Dog(); // Creating an instance of the Dog class
        dog.walk(); // Calling the implemented abstract method
        dog.eat(); // Calling the concrete method from the abstract class
        Cat cat = new Cat(); // Creating an instance of the Cat class
        cat.walk(); // Calling the implemented abstract method
        cat.eat(); // Calling the concrete method from the abstract class
        }
}