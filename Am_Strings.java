import java.util.*;

public class Am_Strings{
    public static void main(String args[]){
        // String Declaration
        String str1 = "Hello";
        
        // String Input from user
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter your  First name: ");
        String str2 = sc1.nextLine(); //.next() reads a single word. Use .nextLine() to read a full line of input.
        System.out.println("Hello, " + str2 + "!");
        System.out.print("Enter your Last name: ");
        String str3 = sc1.nextLine();
        sc1.close();

        //String Concatenation
        String Fullname = str2 + " " + str3;
        System.out.println("Your full name is: " + Fullname + " which is " + Fullname.length() + " characters long.");

        // String charAt() method
        for(int i=0; i<Fullname.length(); i++){
            System.out.println("Character at index " + i + ": " + Fullname.charAt(i));
        }
        
        //String Comparison using .compareTo() method 
        String str4 = "Harshal";
        if(str2.compareTo(str4) == 0){
            System.out.println("str2 and str4 are equal.");
        } else {
            System.out.println("str2 and str4 are not equal.");
        }

        //Sting substring() method
        String  subStr = Fullname.substring(0, 8); // Extracts characters from index 0 to 7 (8 is exclusive)
        System.out.println("Substring of Fullname: " + subStr); 
    }
}