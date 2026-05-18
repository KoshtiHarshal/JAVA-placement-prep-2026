// Constructors in Java are special methods that are used to initialize objects. They have the same name as the class and do not have a return type. Constructors can be used to set initial values for object attributes or to perform any setup required when an object is created.
// Types of Constructors in Java:
// 1. Default Constructor/Non-Parameterized Constructor: A constructor that takes no arguments and initializes the object with default values.
// 2. Parameterized Constructor: A constructor that takes arguments and initializes the object with the provided values.
// 3. Copy Constructor: A constructor that creates a new object as a copy of an existing object.


// Default Constructor Example
class Student{
    String name;
    int rollNo;
    String course;

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Course: " + course);
    }

    public Student() {
        System.out.println("Default Constructor called.");
    }
}

// Parameterized Constructor Example
class Animal {
    String name;
    String species;

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Species: " + species);
    }

    public Animal(String name, String species) {
        this.name = name;
        this.species = species;
        System.out.println("Parameterized Constructor called.");
    }
}

// Copy Constructor Example
class Book {
    String title;
    String author;

    public void displayInfo() {
        System.out.println("The book details are:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Copy Constructor
    public Book(Book book) {
        this.title = book.title;
        this.author = book.author;
        System.out.println("Copy Constructor called.");
    }
}

public class Ax_Constructors {
    public static void main(String args[]){
        Student s1 = new Student(); // This will call the default constructor and print "Default Constructor called."
        s1.name = "John";
        s1.rollNo = 1;
        s1.course = "Computer Science";
        s1.displayInfo(); 

        Animal a1 = new Animal("Leo", "Lion"); // This will call the parameterized constructor and print "Parameterized Constructor called."
        a1.displayInfo();

        Book b1 = new Book("Gitanjali", "Rabindranath Tagore"); // This will call the parameterized constructor and print "Parameterized Constructor called."
        b1.displayInfo();

        Book b2 = new Book(b1); // This will call the copy constructor and print "Copy Constructor called."
        b2.displayInfo();
    }
}
