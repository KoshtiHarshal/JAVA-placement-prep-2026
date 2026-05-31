// Abstraction in Java is a fundamental object-oriented programming concept that allows you to hide the implementation details of a class and only expose the essential features to the user. It helps in reducing complexity and increasing reusability. In Java, abstraction can be achieved using abstract classes and interfaces.

// Example of abstraction


abstract class AbstractionAnimal {
    abstract void walk(); 
    AbstractionAnimal(){ 
        System.out.println("This is an animal."); 
    }
    public void eat() { 
        System.out.println("This animal eats food."); 
    }
}

class AbstractionDog extends AbstractionAnimal {
    AbstractionDog(){ 
        System.out.println("This is a dog."); 
    }
    @Override
    public void walk() { 
        System.out.println("The dog walks on four legs."); 
    }
}

class AbstractionCat extends AbstractionAnimal {
    AbstractionCat(){ 
        System.out.println("This is a cat."); 
    }
    @Override
    public void walk() { 
        System.out.println("The cat walks on four legs."); 
    }
}

public class Bb_Abstraction {
    public static void main(String[] args) {
        AbstractionAnimal dog = new AbstractionDog(); 
        dog.walk(); 
        dog.eat(); 
        
        AbstractionAnimal cat = new AbstractionCat(); 
        cat.walk(); 
        cat.eat(); 
    }
}