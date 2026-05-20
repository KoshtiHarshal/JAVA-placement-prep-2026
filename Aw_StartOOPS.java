// OOPS stands for Object Oriented Programming System
// Class: A class is a blueprint for creating objects. It defines the properties and behaviors of the objects.
// Object: An object is an instance of a class. It has its own state and behavior.
// Method: A method is a function that is defined inside a class. It defines the behavior of the objects of the class.
// In this example, we have a class named "Cars" which has attributes like name, model_name, color, and price. It also has methods like carInfo() and race(). We create two objects of the class "Cars" named c1 and c2, and we set their attributes and call their methods to display the information about the cars.

class Cars { // This is a class named "Cars"
    String name; // This is an attribute of the class "Cars"
    String model_name; 
    String color;
    int price;

    public void setCarDetails(String name, String model_name, String color, int price) { // This is a method named "setCarDetails" which takes parameters to set the attributes of the class "Cars"
        this.name = name;  // The "this" keyword is used to refer to the current object of the class "Cars". It is used to differentiate between the local variable "name" and the instance variable "name" of the class "Cars".
        this.model_name = model_name;
        this.color = color;
        this.price = price;
    }

    public void carInfo() { // This is a method named "carInfo" which displays the information about the car
        System.out.println("Car Name: " + this.name);
        System.out.println("Model Name: " + this.model_name); 
        System.out.println("Color: " + this.color); 
        System.out.println("Price: " + this.price);
    }

    public void race() { // This is a method named "race" which displays a message that the car is racing
        System.out.println("The " + this.name + " is racing");
    }
}

public class Aw_StartOOPS { 
    public static void main(String[] args) {
        Cars c1 = new Cars(); // This is an object of the class "Cars"
        c1.setCarDetails("BMW", "M4", "Black", 1000000);// This is a method call to the method "setCarDetails" of the class "Cars" which sets the attributes of the object "c1"
        c1.race(); // This is a method call to the method "race" of the class "Cars" which displays a message that the car is racing
        c1.carInfo(); // This is a method call to the method "carInfo" of the class "Cars" which displays the information about the car
        
        Cars c2 = new Cars();
        c2.setCarDetails("Lamborghini", "Aventador", "Cyan", 2000000);
        c2.race();
        c2.carInfo();
    }
}