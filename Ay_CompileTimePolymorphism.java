// Polymorphism is a concept in object-oriented programming that allows objects of different classes to be treated as objects of a common superclass. It is the ability of an object to take on many forms. There are two types of polymorphism in Java: compile-time polymorphism and runtime polymorphism.
// Compile Time Polymorphism is also known as Static Polymorphism. It is achieved by method overloading and operator overloading. In Java, we can achieve compile-time polymorphism through method overloading.

class Calculator {
    public void add(int a, int b){ 
        System.out.println("The sum of two integers is: " + (a + b)); // Method overloading: same method name with different parameters
    }

    public void add(double a, double b){
        System.out.println("The sum of two doubles is: " + (a + b)); // Method overloading: same method name with different parameters
    }

    public void add(int a, int b, int c){
        System.out.println("The sum of three integers is: " + (a + b + c)); // Method overloading: same method name with different parameters
    }

    public void add(String a, String b){
        System.out.println("The concatenation of two strings is: " + (a + b)); // Method overloading: same method name with different parameters
    }
}
public class Ay_CompileTimePolymorphism {
    public static void main(String args[]){
        Calculator calc = new Calculator();
        calc.add(5, 10); // Calls the method with two integer parameters
        calc.add(5.5, 10.5); // Calls the method with two double parameters
        calc.add(1, 2, 3); // Calls the method with three integer parameters
        calc.add("Hello, ", "World!"); // Calls the method with two string parameters
    } 
}