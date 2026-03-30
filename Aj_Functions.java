import java.util.*;
import java.util.function.IntUnaryOperator;
public class Aj_Functions {
    public static void printMyName(String name){
        System.out.println("Hello, " + name);
    }

    public static int calculateSum(int a,int b){
        int sum = a + b;
        return sum;
    }

    public static int calculateProduct(int a,int b){
        int product = a * b;
        return product;
    }

    public static void  fact(int n){
        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            return;
        } 
        int factorial = 1;
        for(int i=n;i>=1;i--){
            factorial = factorial * i;
        }
        System.out.println("Factorial is: " + factorial);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.nextLine();
        printMyName(name);

        System.out.println("Enter two numbers:");
        int a = sc.nextInt();
        System.out.println("Enter second number:");
        int b = sc.nextInt();

        System.out.println("Sum of " + a + " and " + b + " is: " + calculateSum(a, b));

        System.out.println("Product of " + a + " and " + b + " is: " + calculateProduct(a, b));

        System.out.println("Enter a number to calculate its factorial:");
        int n = sc.nextInt();
        fact(n);
    }

}
