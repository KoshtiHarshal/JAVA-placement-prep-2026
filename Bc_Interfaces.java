// Interfaces in Java
// An interface in Java is a reference type, similar to a class, that can contain only constants, method signatures, default methods, static methods, and nested types. Interfaces cannot contain instance fields or constructors. They are used to specify a behavior that classes must implement.
// An interface is defined using the `interface` keyword, and a class implements an interface using the `implements` keyword. A class that implements an interface must provide implementations for all of the methods declared in the interface, unless the class is abstract.
// Example of an interface in Java:
interface InterfaceAnimal { // This is an interface named Animal
    void eat(); // Method signature for eat, which must be implemented by any class that implements this interface
    void sleep();
}
interface  InterfacePets{
    void play(); // Method signature for play, which must be implemented by any class that implements this interface
}
class InterfaceDog implements InterfaceAnimal,InterfacePets { // This class implements both the InterfaceAnimal and InterfacePets interfaces 
    public void eat() { // Implementation of the eat method from the InterfaceAnimal interface
        System.out.println("The dog is eating.");
    }

    public void sleep() {
        System.out.println("The dog is sleeping.");
    }

    public void play() {
        System.out.println("The dog is playing.");
    }
}

public class Bc_Interfaces {
    public static void main(String[] args){
        InterfaceDog dog = new InterfaceDog(); 
        dog.eat();
        dog.sleep();
        dog.play();
    }
}