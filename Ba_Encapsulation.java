// Encapsulation is one of the fundamental principles of Object-Oriented Programming (OOP) that helps to protect the internal state of an object and only expose a controlled interface to the outside world.
//  In Java, encapsulation is achieved using access modifiers (public, private, protected, and default) to restrict access to the class members (variables and methods).
// Data hiding is a key aspect of encapsulation, where the internal state of an object is hidden from the outside world and can only be accessed through public methods. This helps to maintain the integrity of the data and prevents unauthorized access or modification.

class Account{
    public String name; // Public access modifier, accessible from anywhere
    String email; // Default access modifier, accessible within the same package
    protected String accountNumber;
    private String password; // Private access modifier, accessible only within the Account class
    
    public String getPassword(){ // Public method to get the password
        return this.password; // Encapsulation: using a method to access a private variable
    }
    public void setPassword(String pass){ // Public method to set the password
        this.password = pass; // Encapsulation: using a method to set a private variable
    }

}
public class Ba_Encapsulation{
    public static void main(String[] args) {
        Account acc = new Account();
        acc.name = "ABC"; // Accessing public variable directly
        acc.email = "example@example.com"; // Accessing default variable directly
        acc.accountNumber = "123456789"; // Accessing protected variable directly
        acc.setPassword("mySecurePassword"); // Setting private variable using public method
        System.out.println("Account Name: " + acc.name);
        System.out.println("Account Email: " + acc.email);
        System.out.println("Account Number: " + acc.accountNumber);
        System.out.println("Account Password: " + acc.getPassword()); // Accessing private variable using public method
    }
}
