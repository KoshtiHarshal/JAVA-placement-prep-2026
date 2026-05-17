// OOPS stands for Object Oriented Programming System
// Class: A class is a blueprint for creating objects. It defines the properties and behaviors of the objects.
// Object: An object is an instance of a class. It has its own state and behavior.
// Method: A method is a function that is defined inside a class. It defines the behavior of the objects of the class.
// In this example, we have a class named "Cars" which has attributes like name, model_name, color, and price. It also has methods like carInfo() and race(). We create two objects of the class "Cars" named c1 and c2, and we set their attributes and call their methods to display the information about the cars.

class Cars{ // This is a class named "Cars"
    String name; // This is an attribute of the class "Cars"
    String model_name; 
    String color;
    int price;

    public void carInfo(){ // This is a method named "carInfo"
        System.out.println("Car Name: " + name);
        System.out.println("Model Name: " + model_name); 
        System.out.println("Color: " + color); 
        System.out.println("Price: " + price);
    }

    public void race(){ // This is a method named "race"
        System.out.println("The car is racing");
    }
}
public class Aw_StartOOPS{
    public static void main(String[] args) {
        Cars c1 = new Cars(); // This is an object of the class "Cars"
        c1.name = "BMW"; // This is an attribute of the object "c1" of the class "Cars"
        c1.model_name = "M4"; 
        c1.color = "Black"; 
        c1.price = 1000000;
        c1.race(); // This is a method call to the method "race" of the class "Cars"
        c1.carInfo(); // This is a method call to the method "carInfo" of the class "Cars"
        
        Cars c2 = new Cars();
        c2.name = "Lamborghini";
        c2.model_name = "Aventador";
        c2.color = "Cyan";
        c2.price = 2000000;
        c2.race();
        c2.carInfo();
    }
}
