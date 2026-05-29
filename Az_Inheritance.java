// Inheritance in Java is a fundamental object-oriented programming concept that allows a new class (called a child or subclass) to inherit properties and behaviors (fields and methods) from an existing class (called a parent or superclass). This promotes code reusability and establishes a natural hierarchical relationship between classes.

// There are several types of inheritance in Java:
// 1. Single Inheritance: A child class inherits from a single parent class.
// 2. Multilevel Inheritance: A child class inherits from a parent class, which in turn inherits from another parent class.
// 3. Hierarchical Inheritance: Multiple child classes inherit from a single parent class.
// Hybrid Inheritance: A combination of two or more types of inheritance. (Note: Java does not support multiple inheritance with classes, but it can be achieved using interfaces.)
// Multiple Inheritance: A child class inherits from more than one parent class. (Note: Java does not support multiple inheritance with classes, but it can be achieved using interfaces.)

// Example of Inheritance
class Parent{ // Parent class
    public void display(){
        System.out.println("I am a parent class");
    }
}
class Child extends Parent{ // Child class inherits from Parent class
    public void display(){
        System.out.println("I am a child class");
        super.display(); // Call the parent class method
    }
}

// Example of Single inheritance
class Shape{ // Parent class
    String color; // Common property for all shapes
    public void area(){
        System.out.println("Displays area"); // Common method for all shapes
    }
}
class Triangle extends Shape{ // Child class inherits from Shape class
    public void area(int l, int h){
        System.out.println("Triangle color: " + color);
        System.out.println("Triangle area: " + (l * h / 2));
    }
}

// Example of Multilevel inheritance
class Cars{ // Parent class
    public void start(){
        System.out.println("Car is starting"); // Common method for all cars
    }
}
class BMW extends Cars{ // Child class inherits from Cars class
    String model; // Specific property for BMW cars
    int price;
    String color;
    }
class M4 extends BMW{
        public void display(){
            System.out.println("Model: " + model); // Display specific properties of M4
            System.out.println("Price: " + price);
            System.out.println("Color: " + color);
            System.out.println("BMW M4 is a high-performance sports car."); // Specific method for M4
        }
}

// Example of Hierarchical inheritance
class Animal { // Parent class
    void eat() {
        System.out.println("This animal eats food."); // Common method for all animals
    }
}
class Dog extends Animal { // Child class inherits from Animal class
    void bark() {
        System.out.println("The dog barks."); // Specific method for Dog class
    }
}
class Cat extends Animal { // Another child class inherits from Animal class
    void meow() {
        System.out.println("The cat meows."); // Specific method for Cat class
    }
}
    
public class Az_Inheritance { 
    public static void main(String[] args) {
        Child child = new Child(); // Create an instance of the Child class
        child.display(); // Call the display method of the Child class, which also calls the Parent class method

        Triangle triangle = new Triangle(); // Create an instance of the Triangle class
        triangle.color = "Red"; // Inherit color property from Shape class
        triangle.area(5, 10); // Call the area method of the Triangle class, which also inherits from Shape class

        M4 m4 = new M4(); // Create an instance of the M4 class, which inherits from BMW and Cars classes
        m4.model = "M4 Competition"; // Inherit model property from BMW class
        m4.price = 70000;
        m4.color = "Blue";
        m4.display(); // Call the display method of the M4 class, which also inherits from BMW and Cars classes

        Dog myDog = new Dog(); // Create an instance of the Dog class, which inherits from Animal class
        myDog.eat(); // Call the eat method inherited from the Animal class
        myDog.bark(); // Call the bark method specific to the Dog class
        Cat myCat = new Cat(); // Create an instance of the Cat class, which also inherits from Animal class
        myCat.eat(); // Call the eat method inherited from the Animal class
        myCat.meow(); // Call the meow method specific to the Cat class
    }
}