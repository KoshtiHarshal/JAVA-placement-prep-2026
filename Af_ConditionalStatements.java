import java.util.*;

class Af_ConditionalStatements {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        // Conditional statements: if-else and switch-case
        
        // if-else statement
        // First input
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (num > 0) {
            System.out.println(num + " is a positive number.");
        } else if (num < 0) {
            System.out.println(num + " is a negative number.");
        } else {
            System.out.println("The number is zero.");
        }
        // No need to close the scanner here, we will use it for the second input
        
        // switch-case statement
        // Second input
        System.out.print("Enter a number (1-7) to get the corresponding day: ");
        int day = scanner.nextInt();

        switch (day) {
            case 1: 
                System.out.println("Monday"); 
            break;
            case 2: 
                System.out.println("Tuesday"); 
            break;
            case 3: 
                System.out.println("Wednesday"); 
            break;
            case 4: 
                System.out.println("Thursday"); 
            break;
            case 5: 
                System.out.println("Friday"); 
            break;
            case 6: 
                System.out.println("Saturday"); 
            break;
            case 7: 
                System.out.println("Sunday"); 
            break;
            default:
                System.out.println("Invalid input! Please enter 1–7.");
        }

        scanner.close(); // close at the end only
    }
}