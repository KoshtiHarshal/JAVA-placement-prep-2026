import java.util.*;
class Ad_InputswithScanner {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.next(); // Read a single word string input.
        System.out.print("Enter your age: ");
        int age = scanner.nextInt(); // Read an integer input.
        System.out.println("Hello, " + name + "! You are " + age + " years old.");
        //Functions of Scanner:
        //1. next(): Reads a single word input.
        //2. nextLine(): Reads a line of text input.
        //3. nextInt(): Reads an integer input.
        //4. nextDouble(): Reads a double input.
        //5. nextBoolean(): Reads a boolean input.
        //6. nextFloat(): Reads a float input.
        //7. nextLong(): Reads a long input.
        //8. nextShort(): Reads a short input.
        //9. nextByte(): Reads a byte input.
        //10. nextDecimal(): Reads a Decimal input.
        //11. close(): Closes the scanner to prevent resource leaks.
        scanner.close();
    }
    
}
